/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Check;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anderson.grigio
 */
public class Check_DAO extends conectar_banco {

    //metodo para realizar a inseção no banco de dados
    public boolean inserir(Check check) {
        //variavel para armazenar status da metodo
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "insert into checagem(data_check,hora_check,tipo_check,cod_hospede,cod_quarto,data_saida)\n"
                + "values('" + check.getData_check() + "','" + check.getHora_check() + "',"
                + "'" + check.getTipo_check() + "','" + check.getCod_hospede() + "','" + check.getCod_quarto() + "','')";
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

    public List<Check> consulta_check(String pesquisa) {
        //criar lista de cidades
        List list_Reserva = new ArrayList<Check>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select r.cod as cod_check,r.data_check,r.hora_check,r.tipo_check,r.cod_hospede,r.cod_quarto,h.nome,q.numero from checagem r\n"
                + "left join cadastro_hospede h on r.cod_hospede=h.cod\n"
                + "left join cadastro_quarto q on r.cod_quarto=q.cod_quarto\n"
                + "where h.nome like '%" + pesquisa + "%' and r.data_saida=''";
        System.out.println(Ssql);
        try {
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while (rts.next()) {
                Check r = new Check();
                r.setCod(rts.getInt("cod_check"));
                r.setCod_hospede(rts.getInt("cod_hospede"));
                r.setCod_quarto(rts.getInt("cod_quarto"));
                r.setData_check(rts.getString("data_check"));
                r.setHora_check(rts.getString("hora_check"));
                r.setTipo_check(rts.getString("tipo_check"));
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

    public List<Check> consulta_check(int cod) {
        //criar lista de cidades
        List list_Reserva = new ArrayList<Check>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select r.cod as cod_check,r.data_check,r.hora_check,r.tipo_check,r.cod_hospede,r.cod_quarto,h.nome,q.numero from checagem r\n"
                + "left join cadastro_hospede h on r.cod_hospede=h.cod\n"
                + "left join cadastro_quarto q on r.cod_quarto=q.cod_quarto\n"
                + "where r.cod = '" + cod + "' and r.data_saida=''";
        System.out.println(Ssql);
        try {
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while (rts.next()) {
                Check r = new Check();
                r.setCod(rts.getInt("cod_check"));
                r.setCod_hospede(rts.getInt("cod_hospede"));
                r.setCod_quarto(rts.getInt("cod_quarto"));
                r.setData_check(rts.getString("data_check"));
                r.setHora_check(rts.getString("hora_check"));
                r.setTipo_check(rts.getString("tipo_check"));
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
        String sql_delete = "delete from checagem where cod_reserva = '" + cod + "'";
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

    
    public boolean saida(Check check) {
        //variavel para armazenar status da metodo
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "update checagem set  tipo_check = 'Saida' , data_saida='"+check.getData_check()+"'"
                + " where cod_hospede ='"+check.getCod()+"'";
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

}
