/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador.model;

public class Sexualidades {
    private int idSex;
    private String sexName;

    public int getIdSex() {
        return idSex;
    }

    public void setIdSex(int idSex) {
        this.idSex = idSex;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }
    
    @Override
    public String toString(){
        return this.getSexName();
    }
}
