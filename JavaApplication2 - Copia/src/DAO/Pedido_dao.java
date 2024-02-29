/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package DAO;

import Entidades.Pedido;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suporte
 */
public class Pedido_dao extends conectar_banco {

    public List<Pedido> consulta_pedido(int p) {

//criar lista de cidades
        List lpedido = new ArrayList<Pedido>(); // "select * from cadastro_hospede where"
        //  + " cod = '" + p + "' ";
//abrir comunicação com o banco
        conectar();
//monta a consulta
        String sql = "select * from cadastro_hospede cd"
                + " inner join Pedido p on cd.cod=p.cod_hospede"
                + " where p.status_ = 'Aberto' and cod ="
                + "'" + p + "'";

        System.out.println(sql);
        try {
// variavel result set recebe resultado
// da conuslta do statement
            rts = sta.executeQuery(sql);
// laço para percorrer o rts
            while (rts.next()) {
                Pedido cid = new Pedido();
                cid.setIcod(rts.getInt("cod_pedido"));
                cid.setSnomehospede(rts.getString("nome"));
                cid.setIdata(rts.getString("data_pedido"));
                cid.setSstatus(rts.getString("status_"));
                cid.setDbvalortotal(rts.getString("valor_total"));

                lpedido.add(cid);

            }
        } catch (SQLException e) {
            System.err.println("Erro consulta"
                    + e);
        }
        desconectar();
        return lpedido;

    }

    public List<Pedido> consulta_pedido(String p) {

//criar lista de cidades
        List lpedido = new ArrayList<Pedido>();
//abrir comunicação com o banco
        conectar();
//monta a consulta
        String sql = "select * from cadastro_hospede cd"
                + " inner join Pedido p on cd.cod=p.cod_hospede"
                + " where p.status_ = 'Aberto'";
        System.out.println(sql);
        try {
// variavel result set recebe resultado
// da conuslta do statement
            rts = sta.executeQuery(sql);
// laço para percorrer o rts
            while (rts.next()) {
                Pedido cid = new Pedido();
                cid.setIcod(rts.getInt("cod"));
                cid.setIcod_hospede(rts.getInt("cod_pedido"));
                cid.setSnomehospede(rts.getString("nome"));
                cid.setIdata(rts.getString("data_pedido"));
                cid.setSstatus(rts.getString("status_"));
                cid.setDbvalortotal(rts.getString("valor_total"));

                lpedido.add(cid);

            }
        } catch (SQLException e) {
            System.err.println("Erro consulta"
                    + e);
        }
        desconectar();
        return lpedido;

    }

    public boolean Inserir(Pedido ped) {
        boolean funcionou = false;
        conectar();
        String query01 = " insert into pedido(cod_hospede,data_pedido,valor_total,status_) "
                + "values('" + ped.getIcod_hospede()+ "'"
                + ",'" + ped.getIdata() + "'"
                + ",'" + ped.getDbvalortotal() + "'"
                + ",'" + ped.getSstatus() + "');";
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

        return funcionou;
    }

    public boolean Pagamento(Pedido ped) {
        boolean funcionou = false;
        conectar();
        String sql = "update pedido set status_ = 'Fechado' where cod_pedido ='" + ped.getIcod() + "'";

        System.err.println(sql);
        try {
            sta.execute(sql);
            funcionou = true;

        } catch (SQLException ex) {
            System.err.println("Erroouuu" + ex);

        }

        return funcionou;
    }

    public List<Pedido> consulta_nome(String p) {

//criar lista de cidades
        List lpedido = new ArrayList<Pedido>();
//abrir comunicação com o banco
        conectar();
//monta a consulta
        String sql = "select * from cadastro_hospede where"
                + " cod like '%" + p + "%'";

        System.out.println(sql);
        try {
// variavel result set recebe resultado
// da conuslta do statement
            rts = sta.executeQuery(sql);
// laço para percorrer o rts
            while (rts.next()) {
                Pedido cid = new Pedido();
                cid.setIcod(rts.getInt("cod"));
                cid.setSnomehospede(rts.getString("nome"));

                lpedido.add(cid);

            }
        } catch (SQLException e) {
            System.err.println("Erro consulta"
                    + e);
        }
        desconectar();
        return lpedido;

    }

    public List<Pedido> consulta_nome(int p) {

//criar lista de cidades
        List lpedido = new ArrayList<Pedido>();
//abrir comunicação com o banco
        conectar();
//monta a consulta
        String sql = "select * from cadastro_hospede where"
                + " cod = '" + p + "'";

        System.out.println(sql);
        try {
// variavel result set recebe resultado
// da conuslta do statement
            rts = sta.executeQuery(sql);
// laço para percorrer o rts
            while (rts.next()) {
                Pedido cid = new Pedido();
                cid.setIcod(rts.getInt("cod"));
                cid.setSnomehospede(rts.getString("nome"));

                lpedido.add(cid);

            }
        } catch (SQLException e) {
            System.err.println("Erro consulta"
                    + e);
        }
        desconectar();
        return lpedido;

    }
}
