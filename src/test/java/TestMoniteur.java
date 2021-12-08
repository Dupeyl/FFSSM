/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FFSSM.Club;
import FFSSM.Moniteur;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestMoniteur {
    private Moniteur moniteur;
    private Club club;
   
    
    @BeforeEach
    public void setUp() {
        moniteur = new Moniteur("1234","Bouaboub","Wiame","Toulouse","07-77-77-77-77",LocalDate.of(2001, 9, 14),001);
        club = new Club(moniteur, "club", "124356789");
    }
    
    @Test
    public void testEmployeurActuel(){
        moniteur.nouvelleEmbauche(club, LocalDate.now());
        assertEquals(club, moniteur.employeurActuel().get(), "Ce n'est pas l'employeur actuel.");
    }
}