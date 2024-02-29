/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
//pacote para identificar onde a classe se localiza
//importações de bibliotecas

import Entidades.Hospede;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

//classe com extensão da classe conecta banco, herda tudo o que existe na classe banco
public class Hospede_DAO extends conectar_banco {

    //metodo para realizar a inseção no banco de dados
    public boolean inserir(Hospede h) {
        //variavel para armazenar status da metodo
        boolean funcionou = false;
        // conecta no banco 
        conectar();
        //Cria String de inserção
        String query01 = "insert into cadastro_hospede(nome,rg,cpf,rua,numero,bairro,cidade,"
                + "estado,cep,email,telefone,data_nascimento,genero,status_) "
                + "values( '" + h.getSnome() + "'"
                + ",'" + h.getIrg() + "'"
                + ",'" + h.getScpf() + "'"
                + ",'" + h.getSrua() + "'"
                + ",'" + h.getInumero() + "'"
                + ",'" + h.getSbairro() + "'"
                + ",'" + h.getScidade() + "'"
                + ",'" + h.getSestado() + "'"
                + ",'" + h.getIcep() + "'"
                + ",'" + h.getSemail() + "'"
                + ",'" + h.getStelefone() + "'"
                + ",'" + h.getSdata_nascimento() + "'"
                + ",'" + h.getSgenero() + "'"
                + ",'ativo')";
        
        
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

    // METODO PARA REALIZAR CONSULTA
    public List<Hospede> consulta_hospede(String hos) {
        //criar lista de cidades
        List hHosp = new ArrayList<Hospede>();
        //abrir comunicação com o banco
        conectar();
        //monta a consulta
        String sql = "SELECT * FROM cadastro_hospede WHERE Nome LIKE'%" + hos + "%'";

        System.out.println(sql);
        try {
            //variavel resultset recebe resultado
            //da consulta do statement
            rts = sta.executeQuery(sql);
            //laço para percorrer o rts
            while (rts.next()) {

                //(nome,rg,cpf,rua,numero,bairro,cidade,estado,cep,email,telefone,data_nascimento,genero)
                Hospede hosp = new Hospede();
                hosp.setIcod(rts.getInt("cod"));
                hosp.setSnome(rts.getString("nome"));
                hosp.setIrg(rts.getInt("rg"));
                hosp.setScpf(rts.getString("cpf"));
                hosp.setSrua(rts.getString("rua"));
                hosp.setInumero(rts.getInt("numero"));
                hosp.setSbairro(rts.getString("bairro"));
                hosp.setScidade(rts.getString("cidade"));
                hosp.setSestado(rts.getString("estado"));
                hosp.setIcep(rts.getInt("cep"));
                hosp.setSemail(rts.getString("email"));
                hosp.setStelefone(rts.getString("telefone"));
                hosp.setSdata_nascimento(rts.getString("data_nascimento"));
                hosp.setSgenero(rts.getString("genero"));
                hosp.setSstatus(rts.getString("status_"));
                hHosp.add(hosp);

            }

        } catch (SQLException e) {
            System.err.println("Erro consulta" + e);
        }
        desconectar();
        return hHosp;

    }

    public List<Hospede> consulta_hospede(int Hos) {
        //criar lista de cidades
        List hHosp = new ArrayList<Hospede>();
        //abrir comunicação com o banco
        conectar();
        //monta a consulta
        String sql = "SELECT * FROM cadastro_hospede WHERE COD = '" + Hos + "'";

        System.out.println(sql);
        try {
            //variavel resultset recebe resultado
            //da consulta do statement
            rts = sta.executeQuery(sql);
            //laço para percorrer o rts
            while (rts.next()) {

                Hospede hosp = new Hospede();
                hosp.setIcod(rts.getInt("cod"));
                hosp.setSnome(rts.getString("nome"));
                hosp.setIrg(rts.getInt("rg"));
                hosp.setScpf(rts.getString("cpf"));
                hosp.setSrua(rts.getString("rua"));
                hosp.setInumero(rts.getInt("numero"));
                hosp.setSbairro(rts.getString("bairro"));
                hosp.setScidade(rts.getString("cidade"));
                hosp.setSestado(rts.getString("estado"));
                hosp.setIcep(rts.getInt("cep"));
                hosp.setSemail(rts.getString("email"));
                hosp.setStelefone(rts.getString("telefone"));
                hosp.setSdata_nascimento(rts.getString("data_nascimento"));
                hosp.setSgenero(rts.getString("genero"));
                hosp.setSstatus(rts.getString("status_"));
                hHosp.add(hosp);

            }

        } catch (SQLException e) {
            System.err.println("Erro consulta" + e);
        }
        desconectar();
        return hHosp;

    }

    public boolean alterar(Hospede hospede) {
        boolean rodou = false;
        conectar();
        //(nome,rg,cpf,rua,numero,bairro,cidade,estado,cep,email,telefone,data_nascimento,genero)
        String sql = "update cadastro_hospede set "
                + "nome='" + hospede.getSnome() + "',"
                + "rg='" + hospede.getIrg() + "',"
                + "cpf='" + hospede.getScpf() + "',"
                + "rua='" + hospede.getSrua() + "',"
                + "numero='" + hospede.getInumero() + "',"
                + "bairro='" + hospede.getSbairro() + "',"
                + "cidade='" + hospede.getScidade() + "',"
                + "estado='" + hospede.getSestado() + "',"
                + "cep='" + hospede.getIcep() + "',"
                + "email='" + hospede.getSemail() + "',"
                + "telefone='" + hospede.getStelefone() + "',"
                + "data_nascimento='" + hospede.getSdata_nascimento() + "',"
                + "genero='" + hospede.getSgenero() + "'"
                + "where cod='" + hospede.getIcod() + "'";
        
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

    public boolean Bloquear(int cod) {
        boolean funcionou = false;
        conectar();
        String sql = "update cadastro_hospede set status_ = 'inativo' where cod ='" + cod + "'";

        System.err.println(sql);
        try {
            sta.execute(sql);
            funcionou = true;

        } catch (SQLException ex) {
            System.err.println("Erroouuu" + ex);

        }

        return funcionou;
    }
    public boolean Desbloquear(int cod) {
        boolean funcionou = false;
        conectar();
        String sql = "update cadastro_hospede set status_ = 'Ativo' where cod ='" + cod + "'";

        System.err.println(sql);
        try {
            sta.execute(sql);
            funcionou = true;

        } catch (SQLException ex) {
            System.err.println("Erroouuu" + ex);

        }

        return funcionou;
    }

}
