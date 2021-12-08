/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FFSSM.Club;
import FFSSM.Licence;
import FFSSM.Moniteur;
import FFSSM.Plongeur;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLicence {
    
    private Moniteur moniteur;
    private Club club;
    private Licence licence1, licence2;
    private Plongeur plongeurN1, plongeurN2;
    
    @BeforeEach
    public void setUp() {
        moniteur = new Moniteur("1234","Bouaboub","Wiame","Toulouse","07-77-77-77-77",LocalDate.of(2001, 9, 14),001);
        club = new Club(moniteur, "club", "124356789");
        licence1= new Licence (plongeurN1,"1",LocalDate.of(2011, 12, 5), club);
        licence2= new Licence (plongeurN2,"2",LocalDate.of(2021, 12, 5), club);
        plongeurN1= new Plongeur("1234","Bouaboub","Wiame","Toulouse","07-77-77-77-77",LocalDate.of(2001, 9, 14));
        plongeurN2= new Plongeur ("1234","Bouaboub","Wiame","Toulouse","07-77-77-77-77",LocalDate.of(2001, 9, 14));
        
    }
    
    @Test
    public void testEstValideTrue() {
        assertTrue(licence2.estValide(LocalDate.now()));
    }
    
    @Test
    public void testEstValideFalse() {
        assertFalse(licence1.estValide(LocalDate.now()));
    }   
}