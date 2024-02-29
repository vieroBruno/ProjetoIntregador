//pacote para identificar onde a classe se localiza
package DAO;
//importações de bibliotecas


import Entidades.Carro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//classe com extensão da classe conecta banco, herda tudo o que existe na classe banco
public class Carro_DAO extends conectar_banco {

    //metodo para realizar a inseção no banco de dados
    public boolean inserir(Carro car) {
        //variavel para armazenar status da metodo
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "insert into cadastro_carro(placa,cor,modelo,cod_hospede) "
                + "values( '" + car.getPlaca() + "'"
                + ",'" + car.getCor() + "'"
                + ",'" + car.getModelo() + "'"
                + ",'" + car.getCod_Hospede()+"')";
        //imprimir a query no pront do java
        System.err.println(query01);
        //realiza a tentativa de inserção
        try {
            //Standemente tenta executar a query    
            sta.execute(query01);
            //muda staus da variavel
            funcionou = true;
        } catch (SQLException ex) {
            //em caso de erro apresenta a falha
            System.err.println("Errooooouuuu " + ex);
        }
        // retorno para quem chamou
        return funcionou;
    }

    //metodo para realizar consulta
    public List<Carro> consulta_carro(String p,int cod_hosp) {
        //criar lista de cidades
        List lcarro = new ArrayList<Carro>();
        //abrir comunicação com o banco
        conectar();
        //monta a consulta
        String sql = "select * from cadastro_carro where"
                + " placa like '%" + p + "%' and cod_hospede='"+cod_hosp+"'";
        System.err.println(sql);
        try {
            // variavel result set recebe resultado
            // da conuslta do statement
            rts = sta.executeQuery(sql);
            // laço para percorrer o rts
            while (rts.next()) {
                Carro car = new Carro();
                car.setCod(rts.getInt("Cod"));
                car.setPlaca(rts.getString("placa"));
                car.setCor(rts.getString("cor"));
                car.setModelo(rts.getString("modelo"));
                lcarro.add(car);
            }
        } catch (SQLException e) {
            System.err.println("Erro consulta"
                    + e);
        }
        desconectar();
        return lcarro;
    }

    //metodo para realizar consulta
    public List<Carro> consulta_carro(int p,int cod_hosp) {
        //criar lista de cidades
        List lcarro = new ArrayList<Carro>();
        //abrir comunicação com o banco
        conectar();
        //monta a consulta
        String sql = "select * from cadastro_carro where"
                + " cod = '" + p + "' and cod_hospede='"+cod_hosp+"'";
        try {
            // variavel result set recebe resultado
            // da conuslta do statement
            rts = sta.executeQuery(sql);
            // laço para percorrer o rts
            while (rts.next()) {
                Carro cid = new Carro();
                cid.setCod(rts.getInt("Cod"));
                cid.setPlaca(rts.getString("placa"));
                cid.setCor(rts.getString("cor"));
                cid.setModelo(rts.getString("modelo"));
                lcarro.add(cid);
            }
        } catch (SQLException e) {
            System.err.println("Erro consulta"
                    + e);
        }
        desconectar();
        return lcarro;
    }

    public boolean excluir(int cod) {
        boolean funfou = false;
        conectar();
        String sql_delete = "Delete from cadastro_carro "
                + "where cod ='" + cod + "'";
        System.err.println(sql_delete);
        try {
            sta.executeUpdate(sql_delete);
            funfou = true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar" + e);
        }
        desconectar();
        return funfou;
    }

    public boolean alterar(Carro sid) {
        boolean rodou = false;
        conectar();
        String sql = "update cadastro_carro set "
                + "placa = '" + sid.getPlaca() + "',"
                + "cor = '" + sid.getCor() + "',"
                + "modelo = '" + sid.getModelo() + "'"
                + "where cod = '" + sid.getCod() + "'";
        System.err.println(sql);
        try {
            sta.executeUpdate(sql);
            rodou = true;
        } catch (SQLException e) {
            System.err.println("Erro ao Alterar" + e);
        }
        desconectar();

        return rodou;

    }
}
