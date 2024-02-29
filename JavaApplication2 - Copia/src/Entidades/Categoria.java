/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lucas.paza
 */
public class Categoria 
{
    private int Icod_categoria;
    private double Dvalor_diaria;
    private String Sitens;
    private String Sdescrição;

    public double getDvalor_diaria() {
        return Dvalor_diaria;
    }

    public void setDvalor_diaria(double Dvalor_diaria) {
        this.Dvalor_diaria = Dvalor_diaria;
    }

    public int getIcod_categoria() {
        return Icod_categoria;
    }

    public void setIcod_categoria(int Icod_categoria) {
        this.Icod_categoria = Icod_categoria;
    }

    public String getSitens() {
        return Sitens;
    }

    public void setSitens(String Sitens) {
        this.Sitens = Sitens;
    }

    public String getSdescrição() {
        return Sdescrição;
    }

    public void setSdescrição(String Sdescrição) {
        this.Sdescrição = Sdescrição;
    }
}
