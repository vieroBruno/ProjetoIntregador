/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Categoria;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas.paza
 */
public class Categoria_DAO extends conectar_banco
{
   //metodo para realizar a inseção no banco de dados
    public boolean inserir(Categoria cat)
    {
       //variavel para armazenar status da metodo
        boolean funcionou=false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 ="insert into categoria_quarto(valor,itens,descricao) "
                   + "values( '"+cat.getDvalor_diaria()+ "'"
                           + ",'"+cat.getSitens()+ "'"
                           + ",'"+cat.getSdescrição()+ "')";
        //imprimir a query no pront do java
        System.err.println(query01);
        //realiza a tentativa de inserção
        try {
            //Standemente tenta executar a query    
            sta.execute(query01);
            //muda staus da variavel
            funcionou=true;
        } catch (SQLException ex) {
            //em caso de erro apresenta a falha
            System.err.println("Errooooouuuu "+ ex);
        }
       // retorno para quem chamou
       return funcionou;
    } 
    
    //metodo para realizar consulta
    public List<Categoria> consulta_categoria(String Spesquisar)
    {
        //criar lista de cidades
        List Lcategoria = new ArrayList<Categoria>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select * from categoria_quarto "
                + "where descricao like '%"+Spesquisar+"%'";
        
        try{
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while(rts.next())
            {
                Categoria c = new Categoria();
                c.setIcod_categoria(rts.getInt("cod"));
                c.setDvalor_diaria(rts.getDouble("valor"));
                c.setSitens(rts.getString("itens"));
                c.setSdescrição(rts.getString("descricao"));
                
                Lcategoria.add(c);
                
            }
        }catch(SQLException e){
            System.err.println("Erro consulta " + e);}
        desconectar();
        return Lcategoria;
    }
    
    public List<Categoria> modifica_categoria(Object pos)
    {
        //criar lista de cidades
        List Lcategoria = new ArrayList<Categoria>();
        //abrir comunicação com banco
        conectar();
        //monta a consulta
        String Ssql = "select * from categoria_quarto "
                + "where cod = " + pos;
        
        try{
            // alimenta ressultset com Statement  
            rts = sta.executeQuery(Ssql);
            // laço para percorrer o rts
            while(rts.next())
            {
                Categoria c = new Categoria();
                c.setIcod_categoria(rts.getInt("cod"));
                c.setDvalor_diaria(rts.getDouble("valor"));
                c.setSitens(rts.getString("itens"));
                c.setSdescrição(rts.getString("descricao"));
                
                
                Lcategoria.add(c);
                
            }
        }catch(SQLException e){
            System.err.println("Erro consulta " + e);}
        desconectar();
        return Lcategoria;
    }

public boolean alterar (Categoria cat)
    {
        boolean rodou = false;
        conectar();
        String sql = "Update categoria_quarto set "
                + "descricao = '"+cat.getSdescrição()+"',"
                + "itens = '"+cat.getSitens()+"',"
                + "valor = '"+cat.getDvalor_diaria()+"'"
                + "where cod = '"+cat.getIcod_categoria()+"'";
        
        System.err.println(sql);
        
        try
        {
            sta.executeUpdate(sql);
            rodou = true;
        }
        catch(SQLException e){
            System.err.println("Erro  ao alterar " + e);}
        desconectar();
        
        return rodou;
    }

public boolean excluir(int cod)
    {
        boolean funfou = false;
        conectar();
        String Ssql_delete = "Delete from categoria_quarto "
                + "where cod ='"+ cod +"'";
        System.err.println(Ssql_delete);
        
        try
        {
            sta.executeUpdate(Ssql_delete);
            funfou = true;
        }
        catch(SQLException e){
            System.err.println("Erro  ao deletar " + e);}
        desconectar();
        return funfou;
    }
    
}
