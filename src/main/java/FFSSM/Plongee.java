/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

	public Site lieu;
	public Moniteur chefDePalanquee;
	public LocalDate date;
	public int profondeur;
	public int duree;
        public ArrayList<Plongeur> lesPlongeurs= new ArrayList<Plongeur>();

	public Plongee(Site lieu, Moniteur chefDePalanquee, LocalDate date, int profondeur, int duree) {
		this.lieu = lieu;
		this.chefDePalanquee = chefDePalanquee;
		this.date = date;
		this.profondeur = profondeur;
		this.duree = duree;
	}

	public void ajouteParticipant(Plongeur participant) {
            if(!(lesPlongeurs.contains(participant))){
            lesPlongeurs.add(participant);
            }
	}

	public LocalDate getDate() {
		return date;
	}

	/**
	 * Détermine si la plongée est conforme. 
	 * Une plongée est conforme si tous les plongeurs de la palanquée ont une
	 * licence valide à la date de la plongée
	 * @return vrai si la plongée est conforme
	 */
	public boolean estConforme() {
            boolean res=true;
            int i =0;
            while(res==true){
                res=lesPlongeurs.get(i).derniereLicence().estValide(getDate());
                i+=i;
            }
        return res;
        }
}
