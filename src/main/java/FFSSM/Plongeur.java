package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plongeur extends Personne{
    
	private String numeroINSEE;
        private String nom;
        private String prenom; 
        private String adresse; 
        private String telephone; 
        private LocalDate naissance;
        private ArrayList<Licence> lesLicences;

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
    }

        @Override
    public String getNumeroINSEE() {
        return numeroINSEE;
    }

        @Override
    public String getNom() {
        return nom;
    }

        @Override
    public String getPrenom() {
        return prenom;
    }

        @Override
    public String getAdresse() {
        return adresse;
    }

        @Override
    public String getTelephone() {
        return telephone;
    }

        @Override
    public LocalDate getNaissance() {
        return naissance;
    }
    
    public void ajouteLicence(String numero, LocalDate delivrance, Club c ){
        if (this.numeroINSEE.equals(numero)){
        Licence l=new Licence(numero, delivrance, c);
        lesLicences.add(l);
        }
    }        
    
    public Licence derniereLicence(){
        return lesLicences.get(lesLicences.size()-1);
    }
}
