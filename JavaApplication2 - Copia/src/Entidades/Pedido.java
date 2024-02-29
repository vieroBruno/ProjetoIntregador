/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Suporte
 */
public class Pedido {

    private int icod;
    private int icod_hospede;
    private String idata;
    private String dvalortotal;
    private String snomehospede;

    public String getDvalortotal() {
        return dvalortotal;
    }

    public void setDvalortotal(String dvalortotal) {
        this.dvalortotal = dvalortotal;
    }

    public String getSnomehospede() {
        return snomehospede;
    }

    public void setSnomehospede(String snomehospede) {
        this.snomehospede = snomehospede;
    }

    
    
    private String sstatus;
    private String dbvalortotal;

    public String getDbvalortotal() {
        return dbvalortotal;
    }

    public void setDbvalortotal(String dbvalortotal) {
        this.dbvalortotal = dbvalortotal;
    }

 

    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus;
    }

    public int getIcod() {
        return icod;
    }

    public void setIcod(int icod) {
        this.icod = icod;
    }

    public String getIdata() {
        return idata;
    }

    public void setIdata(String idata) {
        this.idata = idata;
    }

    public int getIcod_hospede() {
        return icod_hospede;
    }

    public void setIcod_hospede(int icod_hospede) {
        this.icod_hospede = icod_hospede;
    }

  
}
