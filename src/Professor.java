/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumne
 */
public class Professor {
    
    private String dni;
    private String nom;
    private String departament;
    
    public Professor(String dni,String nom, String departament){
        this.dni = dni;
        this.nom = nom;
        this.departament = departament;
    }
    
    public String getDni(){
        return this.dni;
    }
    public String getNom(){
        return this.nom;
    }
    public String getDepart(){
        return this.departament;
    }
    public String getProf(){
        return this.nom + "-" + this.dni;
    }
    
}
