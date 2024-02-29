package DAO;
//classe para conectar


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conectar_banco {
    Connection banco = null;
    Statement sta = null;
    ResultSet rts = null;
    
//metodo para conectar

    public void conectar() {
        //variaveis para conectar no banco    
        String user = "root";
        String senha = "Bru123no!";
        String IP = "localhost";
        String porta = "3306";
        String bd = "hotel";

        //montar string de conexão
        String servidor = "jdbc:mysql://" + IP + ":" + porta + "/" + bd;
        //javadatabaseconection

        System.out.println(servidor);
        //driver de conexao
        String driver = "org.gjt.mm.mysql.Driver";

        //realiza tentativa de conexao com banco
        try {
            //registrar o driver
            Class.forName(driver);
            //realizar a conexao
            this.banco = (Connection) DriverManager.getConnection(servidor,user,senha);
            this.sta = (Statement) 
                    this.banco.createStatement();
           System.out.println("Sucesso");
            
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            //apresenta erro
            System.err.println("erro ao conectar"+e);
        }

    }
    
    public void desconectar(){
        try {
            banco.close();
        } catch (SQLException ex) {
            Logger.getLogger(conectar_banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
