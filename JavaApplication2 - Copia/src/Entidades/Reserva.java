package Entidades;

public class Reserva {

    private int iCodReserva;
    private int cod_hospede;
    private String SDentrada;
    private String SDsaida;
    private int cod_quarto;
    private String nome;
    private String quarto;

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

    public int getiCodReserva() {
        return iCodReserva;
    }

    public void setiCodReserva(int iCodReserva) {
        this.iCodReserva = iCodReserva;
    }


    public int getCod_hospede() {
        return cod_hospede;
    }

    public void setCod_hospede(int cod_hospede) {
        this.cod_hospede = cod_hospede;
    }

    public String getSDentrada() {
        return SDentrada;
    }

    public void setSDentrada(String SDentrada) {
        this.SDentrada = SDentrada;
    }

    public String getSDsaida() {
        return SDsaida;
    }

    public void setSDsaida(String SDsaida) {
        this.SDsaida = SDsaida;
    }

    public int getCod_quarto() {
        return cod_quarto;
    }

    public void setCod_quarto(int cod_quarto) {
        this.cod_quarto = cod_quarto;
    }

}
