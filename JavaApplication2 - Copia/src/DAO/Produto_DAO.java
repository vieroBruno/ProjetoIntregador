/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suporte
 */
public class Produto_DAO extends conectar_banco {

    public boolean inserir(Produto produto) {
        boolean funcionou = false;
        conectar();
        String query01 = "insert into produto(descricao,valor_unitario,stats) values('" + produto.getDescricao() + "','" + produto.getValor_unitario() + "','" + produto.getStats() + "')";
        System.err.println(query01);
        try {
            sta.execute(query01);
            funcionou = true;
        } catch (SQLException ex) {
            System.err.println("ERRO " + ex);
        }
        return funcionou;
    }

    public List<Produto> consulta_produto(String p) {
        //metodo para realizar consulta
        //interface
        //criar lista de cidades
        List Pproduto = new ArrayList<Produto>();
        //abrir comunicação com o banco

        conectar();
        //monta a consulta
        String sql = "select * from produto where"
                   + " descricao like '%" + p + "%'";
        System.out.println(sql);
        try {
            // variavel result set recebe resultado
            // da conuslta do statement
            rts = sta.executeQuery(sql);
            // laço para percorrer o rts
            while (rts.next()) {
                Produto pro = new Produto();
                pro.setCod_produto(rts.getInt("cod"));
                pro.setDescricao(rts.getString("Descricao"));
                pro.setValor_unitario(rts.getDouble("valor_unitario"));
                pro.setStats(rts.getString("stats"));
                Pproduto.add(pro);
            }
        } catch (SQLException e) {
            System.err.println("Erro consulta" + e);
        }

        desconectar();
        return Pproduto;
 }

    public List<Produto> lista_produto(int p) {
        //metodo para realizar consulta
        //informações
        //criar lista de cidades
        List Pproduto = new ArrayList<Produto>();
        //abrir comunicação com o banco

        conectar();
        //monta a consulta
        String sql = "select * from produto where"
                   + " cod like '%" + p + "%'";

        try {
            // variavel result set recebe resultado
            // da conuslta do statement
            rts = sta.executeQuery(sql);
            // laço para percorrer o rts
            while (rts.next()) {
                Produto pro = new Produto();
                pro.setCod_produto(rts.getInt("cod"));
                pro.setDescricao(rts.getString("descricao"));
                pro.setValor_unitario(rts.getDouble("valor_unitario"));
                pro.setStats(rts.getString("stats"));
                Pproduto.add(pro);
            }
        } catch (SQLException e) {
            System.err.println("Erro consulta" + e);
        }

        desconectar();
        return Pproduto;
    }

    public boolean Status(String st) {
        boolean funcionou = false;
        conectar();
        String sql_stats = "update from produto "
                + "where cod_produto ='" + st + "'";
        System.err.println(sql_stats);
        try {
            sta.executeUpdate(sql_stats);
            funcionou = true;
        } catch (SQLException e) {
            System.err.println("Erro ao trocar status" + e);
        }
        desconectar();
        return funcionou;
    }

    public boolean alterar(Produto pro) {
        boolean rodou = false;
        conectar();
        String sql = "update produto set "              
                + "Valor_unitario = '" + pro.getValor_unitario() + "',"
                + "Descricao = '" + pro.getDescricao() + "',"
                + "Stats = '" + pro.getStats() + "' "
                + "where   cod = '" + pro.getCod_produto() + "'";
        System.err.println(sql);
        try {
            sta.executeUpdate(sql);
            rodou = true;
        } catch (SQLException e) {
            System.err.println("Erro ao alterar" + e);
        }
        desconectar();

        return rodou;
    }







}
