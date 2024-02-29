/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author anderson.grigio
 */
public class Check {

    private int cod;
    private String data_check;
    private String hora_check;
    private String tipo_check;
    private int cod_hospede;
    private int cod_quarto;
    private String nome;
    private String quarto;
    

    /*------------------------------------------------
    
    Metodo para pegar o codigo e grava na variavel cod
    
    -------------------------------------------------*/
    public int getCod() {
        return cod;
    }

    /*------------------------------------------------
    
    Metodo para recuperar o codigo e devolver para o solicitante da chamada
    
    -------------------------------------------------*/
    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getData_check() {
        return data_check;
    }

    public void setData_check(String data_check) {
        this.data_check = data_check;
    }

    public String getHora_check() {
        return hora_check;
    }

    public void setHora_check(String hora_check) {
        this.hora_check = hora_check;
    }

    public String getTipo_check() {
        return tipo_check;
    }

    public void setTipo_check(String tipo_check) {
        this.tipo_check = tipo_check;
    }

    public int getCod_hospede() {
        return cod_hospede;
    }

    public void setCod_hospede(int cod_hospede) {
        this.cod_hospede = cod_hospede;
    }

    public int getCod_quarto() {
        return cod_quarto;
    }

    public void setCod_quarto(int cod_quarto) {
        this.cod_quarto = cod_quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }
    


}
