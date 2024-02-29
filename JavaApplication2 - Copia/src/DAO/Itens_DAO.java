package DAO;

import Entidades.Itens;
import Entidades.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Itens_DAO extends conectar_banco {

    public boolean inserir(Itens ittens) {
        //variavel para armazenar status da metodo
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "insert into itens_pedido(cod_pedido,cod_produto,quantidade) "
                + "values( '"+ittens.getCod_pedido()+"'"
                + ",'" + ittens.getCod_produto() + "'"
                + ",'" + ittens.getQuantidade() + "')";//sdsd//
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

    public List<Itens> consulta_itens(int cod_Pedido) {
        List lista_itens = new ArrayList<Itens>();

        conectar();
        String sql = "select i.cod,i.cod_pedido,i.cod_produto,i.quantidade,p.descricao,p.valor_unitario  from itens_pedido i \n"
                + "left join produto p on i.cod_produto=p.cod "
                + "where i.cod_pedido='"+cod_Pedido+"'";
        System.err.println(sql);
        try {

            rts = sta.executeQuery(sql);
            while (rts.next()) {
                Itens iten = new Itens();
                iten.setCod(rts.getInt("cod"));
                iten.setCod_pedido(rts.getInt("cod_pedido"));
                iten.setCod_produto(rts.getInt("cod_produto"));
                iten.setQuantidade(rts.getDouble("quantidade"));
                iten.setDescricao(rts.getString("descricao"));
                iten.setVlr(rts.getDouble("valor_unitario"));
                lista_itens.add(iten);
            }

        } catch (SQLException e) {
            System.err.println("Erro consulta " + e);
        }
        //desconectar(); n foi criado ainda
        return lista_itens;
    }

    public List<Itens> consulta_itens(int cod, int cod_Pedido) {
        List lista_itens = new ArrayList<Itens>();

        conectar();
        String sql = "select i.cod,i.cod_pedido,i.cod_produto,i.quantidade,p.descricao,p.valor_unitario  from itens_pedido i \n"
                + "left join produto p on i.cod_produto=p.cod"
                + " where i.cod='" + cod + "' and i.cod_pedido='"+cod_Pedido+"'";
        System.err.println(sql);
        try {

            rts = sta.executeQuery(sql);
            while (rts.next()) {
                Itens iten = new Itens();
                iten.setCod(rts.getInt("cod"));
                iten.setCod_pedido(rts.getInt("cod_pedido"));
                iten.setCod_produto(rts.getInt("cod_produto"));
                iten.setQuantidade(rts.getDouble("quantidade"));
                iten.setDescricao(rts.getString("descricao"));
                iten.setVlr(rts.getDouble("valor_unitario"));
                lista_itens.add(iten);
            }

        } catch (SQLException e) {
            System.err.println("Erro consulta " + e);
        }
        //desconectar(); n foi criado ainda
        return lista_itens;
    }

    public boolean excluir(int cod) {
        boolean funfou = false;
        conectar();
        String sql_delete = "Delete from itens_pedido "
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
}
