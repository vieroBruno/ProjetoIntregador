package DAO;

import Entidades.Dependente;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;

//classe com extensão da classe conecta banco, herda tudo o que existe na classe banco 
public class Dependete_DAO extends conectar_banco{
       //metodo para realizar a inseção no banco de dados  
    public boolean inserir(Dependente dp) {
        //variavel para armazenar status da metodo 
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "insert into cadastro_dependentes(nome,data_nascimento,cod_hospede,rg) " 
                         + "values( '" + dp.getsNome()+ "'"
                         + ",'" + dp.getsDataNascimento()+ "'"
                         + ",'" + dp.getiCodHospede()+ "'"
                         + ",'" + dp.getiRG() + "')";  
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
          
    public boolean alterar(Dependente dp) {
        //variavel para armazenar status da metodo 
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "update cadastro_dependentes set \n" +
                         "nome='"+dp.getsNome()+"',data_nascimento='"+dp.getsDataNascimento()+"',"
                         +
                         "rg='"+dp.getiRG()+"' where cod='"+dp.getiCodDependete()+"'";  
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
    
    public boolean excluir(int cod_dependente) {
        //variavel para armazenar status da metodo 
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "delete from cadastro_dependentes where cod='"+cod_dependente+"'";  
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
    
        //Metodo para realizar Consulta
    public List<Dependente> Consulta_dependente(String d, int cod_hospede) {

        // criar lista de cidades
        List ldp = new ArrayList<Dependente>();

        // abrir conexão com o banco
        conectar();

        //monta a consulta
        String sql = "Select * from cadastro_dependentes where"
                + " nome like '%" + d + "%' and cod_hospede='"+cod_hospede+"'";
        try {
            //Standemente tenta executar a query    
            rts = sta.executeQuery(sql);
            //laço para percorrer o rts

            while (rts.next()) {

                Dependente dp = new Dependente();
                dp.setsNome(rts.getString("nome"));
                dp.setsDataNascimento(rts.getString("data_nascimento"));
                dp.setiRG(rts.getInt("rg"));
                dp.setiCodDependete(rts.getInt("cod"));

                ldp.add(dp);

            }

        } catch (SQLException ex) {
            //em caso de erro apresenta a falha
            System.err.println("Erro Consulta " + ex);
        }

        desconectar();
        return ldp;
    }
    
     public List<Dependente> Consulta_dependentes_cod(Object p, int cod_hospede) {

        // criar lista de cidades
        List ldp = new ArrayList<Dependente>();

        // abrir conexão com o banco
        conectar();

        //monta a consulta
        String sql = "Select * from cadastro_dependentes where"
                + " cod =" + p +" and cod_hospede='"+cod_hospede+"'";

        try {
            //Standemente tenta executar a query    
            rts = sta.executeQuery(sql);
            //laço para percorrer o rts

            while (rts.next()) {

                Dependente dp = new Dependente();
                dp.setsNome(rts.getString("nome"));
                dp.setsDataNascimento(rts.getString("data_nascimento"));
                dp.setiRG(rts.getInt("rg"));
                dp.setiCodHospede(rts.getInt("cod_hospede"));
                dp.setiCodDependete(rts.getInt("cod"));


                ldp.add(dp);

            }

        } catch (SQLException ex) {
            //em caso de erro apresenta a falha
            System.err.println("Erro Consulta " + ex);
        }

        desconectar();
        return ldp;
    }
}
