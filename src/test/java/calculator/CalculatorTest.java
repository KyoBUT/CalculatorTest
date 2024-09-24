package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CalculatorTest {

        @Test
        void devrait_obtenir_le_resultat_de_laddition() {
            //GIVEN
            Calculator calculator = new Calculator();
            int opG = 2;
            int opD = 3;

            //WHEN
            int resultat = calculator.add(opG, opD);

            //THEN
            assertEquals(5, resultat);
        }


        @Test
        void devrait_obtenir_le_resultat_de_la_division() {
            //GIVEN
            Calculator calculator = new Calculator();
            int opG = 6;
            int opD = 3;

            //WHEN
            int resultat = calculator.divide(opG, opD);

            //THEN
            assertEquals(2, resultat);
        }

        @Test
        void devrait_obtenir_le_resultat_de_la_division_par_zero() {
            //GIVEN
            Calculator calculator = new Calculator();
            int opG = 6;
            int opD = 0;


            try {
                //WHEN
                calculator.divide(opG, opD);
            } catch (ArithmeticException e) {
                //THEN
                assertEquals("/ by zero", e.getMessage());
            }
        }
}