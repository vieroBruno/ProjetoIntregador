package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import Entidades.Reserva;

public class Reserva_DAO extends conectar_banco {

    //metodo para realizar a inseção no banco de dados
    public boolean inserir(Reserva rp) {
        //variavel para armazenar status da metodo
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "insert into reserva(cod_hospede, data_entrada ,data_saida,cod_quarto)\n"
                + "values('" + rp.getCod_hospede() + "','" + rp.getSDentrada() + "',"
                + "'" + rp.getSDsaida() + "','" + rp.getCod_quarto() + "');";
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

    public List<Reserva> consulta_reserva(String pesquisa) {
        //criar lista de cidades
        List list_Reserva = new ArrayList<Reserva>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select * from reserva r\n"
                + "left join cadastro_hospede h on r.cod_hospede=h.cod\n"
                + "where nome like '%" + pesquisa + "%'";
        System.out.println(Ssql);
        try {
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while (rts.next()) {
                Reserva r = new Reserva();
                r.setCod_hospede(rts.getInt("cod_hospede"));
                r.setCod_quarto(rts.getInt("cod_quarto"));
                r.setSDentrada(rts.getString("data_entrada"));
                r.setSDsaida(rts.getString("data_saida"));
                r.setiCodReserva(rts.getInt("cod_reserva"));
                r.setNome(rts.getString("nome"));
                r.setQuarto(rts.getString("numero"));

                list_Reserva.add(r);

            }
        } catch (SQLException e) {
            System.err.println("Erro consulta " + e);
        }
        desconectar();
        return list_Reserva;
    }

    public List<Reserva> consulta_reserva(int cod) {
        //criar lista de cidades
        List list_Reserva = new ArrayList<Reserva>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select * from reserva r\n"
                + "left join cadastro_hospede h on r.cod_hospede=h.cod\n"
                + "left join cadastro_quarto q on r.cod_quarto=q.cod_quarto\n"
                + "where cod_reserva = '" + cod + "'";
        System.out.println(Ssql);
        try {
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while (rts.next()) {
                Reserva r = new Reserva();
                r.setCod_hospede(rts.getInt("cod_hospede"));
                r.setCod_quarto(rts.getInt("cod_quarto"));
                r.setSDentrada(rts.getString("data_entrada"));
                r.setSDsaida(rts.getString("data_saida"));
                r.setiCodReserva(rts.getInt("cod_reserva"));
                r.setNome(rts.getString("nome"));
                r.setQuarto(rts.getString("numero"));

                list_Reserva.add(r);

            }
        } catch (SQLException e) {
            System.err.println("Erro consulta " + e);
        }
        desconectar();
        return list_Reserva;
    }

    public boolean excluir(int cod) {
        boolean funfou = false;
        String sql_delete = "delete from reserva where cod_reserva = '" + cod + "'";
        conectar();
        try {
            sta.executeUpdate(sql_delete);
            funfou = true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar");
        }
        desconectar();
        return funfou;
    }

}
