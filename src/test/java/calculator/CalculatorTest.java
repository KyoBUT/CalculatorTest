package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Set;


class CalculatorTest {

        /*@BeforeEach void setUp() {
            calculator = new Calculator();
        }

        @AfterEach void tearDown() {
            calculator = null;
        }*/

        @Test
        void devrait_obtenir_le_resultat_de_laddition() {
            //GIVEN
            int opG = 2;
            int opD = 3;

            //WHEN
            int resultat = Calculator.add(opG, opD);

            //THEN
            assertEquals(5, resultat);
        }

        @ParameterizedTest(name = "{0} + {1} = {2}")
        @CsvSource({
                "0,    1,   1",
                "1,    2,   3",
                "-2,   2,   0",
                "0,    0,   0",
                "-1,   -2,  -3"
        })

        void add_parametre_devrait_calculer_la_somme_de_deux_int(int first, int second, int expectedResult)  {
            // GIVEN

            // WHEN
            int somme = Calculator.add(first, second);

            // THEN  -- SI on ne s'occupe pas de l'exception levée

            //assertEquals(expectedResult, calculatorEnTest.add(first, second),
            //		() -> first + " + " + second + " should equal " + expectedResult);	// JUnit
            assertEquals(expectedResult, somme);	                            // assertJ
        }

        @Test
        void divide_devrait_retourner_quotient_nul_quand_diviseur_plus_grand_que_dividende()
        {
            // GIVEN

            // WHEN
            int quotient = Calculator.divide(1,2);

            //THEN
            assertEquals(0, quotient);
        }

        @Test
        void divide_devrait_retourner_quotient_non_nul_quand_diviseur_plus_petit_que_dividende()
        {
            // GIVEN

            // WHEN
            int quotient = Calculator.divide(7,2);

            //THEN
            assertEquals(3, quotient);
        }

        @Test
        void digitsSet_devrait_retourner_les_chiffres_d_un_entier_positif() {
            //GIVEN
            int entierPositif = 97689;

            //WHEN
            Set<Integer> ensembleChiffres = Calculator.ensembleChiffres(entierPositif);

            //THEN
            assertEquals(5, ensembleChiffres.size());
        }

        @Test
        void digitsSet_devrait_retourner_les_chiffres_d_un_entier_negatif() {
            //GIVEN
            int entierNegatif = -1;

            //WHEN
            Set<Integer> ensembleChiffres = Calculator.ensembleChiffres(entierNegatif);

            //THEN
            assertEquals(1, ensembleChiffres.size());
        }
        @Test
        void digitsSet_devrait_retourner_le_chiffre_0_d_un_entier_nul() {
            //GIVEN
            int entierNul = 0000;

            //WHEN
            Set<Integer> ensembleChiffres = Calculator.ensembleChiffres(entierNul);

            //THEN
            assertEquals(1, ensembleChiffres.size());
        }
}