package personne;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class personneTest{


        @Test
        public void testTourner() {
            //GIVEN
            personne monPersonnage = new personne();
            //WHEN
            String result=monPersonnage.tourner(3);
            // Test après 1 quart de tour
            assertThat(result).isEqualTo("OUEST");
            /*
            // Test après 2 quarts de tour
            assertThat(monPersonnage.tourner(1)).isEqualTo("SUD");

            // Test après 3 quarts de tour
            assertThat(monPersonnage.tourner(1)).isEqualTo("OUEST");

            // Test après 4 quarts de tour (retour à la position initiale)
            assertThat(monPersonnage.tourner(1)).isEqualTo("NORD");

            // Test avec un nombre de quarts de tour plus grand que 4 (modulo 4)
            assertThat(monPersonnage.tourner(5)).isEqualTo("EST");

            // Test avec un nombre négatif de quarts de tour (tourner dans l'autre sens)
            assertThat(monPersonnage.tourner(-1)).isEqualTo("OUEST");

            // Test après un tour complet (4 quarts)
            assertThat(monPersonnage.tourner(4)).isEqualTo("NORD");

            // Test après plusieurs tours complets (8 quarts)
            assertThat(monPersonnage.tourner(8)).isEqualTo("EST");

             */
        }










}