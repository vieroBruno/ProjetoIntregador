/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author gabriel.pelicer
 */
public class Dependente  {
    
    private int iCodDependete;
    private String sNome;
    private String sDataNascimento;     
    private int iCodHospede;
    private int iRG;

    public int getiCodDependete() {
        return iCodDependete;
    }

    public void setiCodDependete(int iCodDependete) {
        this.iCodDependete = iCodDependete;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getsDataNascimento() {
        return sDataNascimento;
    }

    public void setsDataNascimento(String sDataNascimento) {
        this.sDataNascimento = sDataNascimento;
    }

    public int getiCodHospede() {
        return iCodHospede;
    }

    public void setiCodHospede(int iCodHospede) {
        this.iCodHospede = iCodHospede;
    }

    public int getiRG() {
        return iRG;
    }

    public void setiRG(int iRG) {
        this.iRG = iRG;
    }
    
    
   
}
