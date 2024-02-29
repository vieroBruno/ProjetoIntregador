/*------------------------------------------------
    
    Declaração de qual pacote está a classe
    
    -------------------------------------------------*/
package Entidades;

/*------------------------------------------------
    
    Declaração class cidades - public = visivel para todos as classes java
    
    -------------------------------------------------*/
public class Carro {

    /*------------------------------------------------
    
    Declaração das variaveis que compoem o objeto Cidades; 
    private significa que a variavel so pode ser utilizada pela classe Cidades
    
    -------------------------------------------------*/
    private int cod;
    private String placa;
    private String cor;
    private String modelo;
    private int cod_Hospede;

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCod_Hospede() {
        return cod_Hospede;
    }

    public void setCod_Hospede(int cod_Hospede) {
        this.cod_Hospede = cod_Hospede;
    }

}
