/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Quarto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suporte
 */
public class Quarto_DAO extends conectar_banco {



    public boolean inserir(Quarto quarto) {
        System.out.println("AKI5");
        boolean funcionou = false;

        conectar();

        String query01 = "insert into cadastro_quarto(numero,andar,cod_categoria)values('" + quarto.getTxtNumero() + "','" + quarto.getTxtAndar() + "','" + quarto.getTxtCodCategoria() + "')";
        System.err.println(query01);

        try {
            sta.execute(query01);
            System.err.println(query01);
            System.out.println("AKIeita");
            funcionou = true;
        } catch (SQLException ex) {

            System.err.println("Errooooouuuu " + ex);
        }

        return funcionou;

    }
    
    
       public boolean alterar(Quarto quarto) {
        System.out.println("AKI5");
        boolean funcionou = false;
        conectar();
        String query01 = "update cadastro_quarto set numero='" + quarto.getTxtNumero() + "',andar='" + quarto.getTxtAndar() + "',cod_categoria'" + quarto.getTxtCodCategoria() + "'"
                + " where cod_quarto='"+quarto.getiCod()+"'";
        System.err.println(query01);

        try {
            sta.execute(query01);
            System.err.println(query01);
            System.out.println("AKIeita");
            funcionou = true;
        } catch (SQLException ex) {

            System.err.println("Errooooouuuu " + ex);
        }

        return funcionou;

    }
       
     public boolean excluir( int cod_quarto) {
        boolean funfou = false;
        String sql_delete = "delete from cadastro_quarto where cod = '" + cod_quarto + "'";
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

     

   public List<Quarto> consulta_quarto(String num_Quarto) {
        //criar lista de cidades
        List Quarto = new ArrayList<Quarto>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select * from cadastro_quarto "
                + "where numero like '%" + num_Quarto + "%'";
        System.out.println(Ssql);
        try {
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while (rts.next()) {
                Quarto c = new Quarto();
                c.setTxtAndar(rts.getInt("andar"));
                c.setTxtCodCategoria(rts.getInt("cod_categoria"));
                c.setTxtNumero(rts.getInt("numero"));
                c.setiCod(rts.getInt("cod_quarto"));
                
                Quarto.add(c);
                
            }
        } catch (SQLException e) {
            System.err.println("Erro consulta " + e);
        }
        desconectar();
        return Quarto;
    }
public List<Quarto> consulta_quarto(int cod) {
        //criar lista de cidades
        List Quarto = new ArrayList<Quarto>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select * from cadastro_quarto "
                + "where cod_quarto = '" + cod + "'";
        System.out.println(Ssql);
        try {
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while (rts.next()) {
                Quarto c = new Quarto();
                c.setTxtAndar(rts.getInt("andar"));
                c.setTxtCodCategoria(rts.getInt("cod_categoria"));
                c.setTxtNumero(rts.getInt("numero"));
                c.setiCod(rts.getInt("cod_quarto"));
                
                Quarto.add(c);
                
            }
        } catch (SQLException e) {
            System.err.println("Erro consulta " + e);
        }
        desconectar();
        return Quarto;
    }
}
