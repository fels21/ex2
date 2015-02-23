public class Assginatura {
    
    private String nom;
    private int credits;
    private String descripcio;
    private String dni_prof;
    
    public Assginatura (String nom,int credits, String descripcio, String dni_prof){
        this.nom = nom;
        this.credits = credits;
        this.descripcio = descripcio;
        this.dni_prof = dni_prof;
    }    
    
    public String getNom(){
        return this.nom;
    }
    
    public int getCredits(){
        return this.credits;
    }
    
    public String getDescripcio(){
        return this.descripcio;
    }
    
    public String getDni_prof(){
        return this.dni_prof;
    }
    
}
