package TestCOD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonajeTest {
        @Test
        public void testCalcularDanio() {
            Personaje personaje = new Personaje();

            //Ataque mayor que defensa
            assertEquals(20, personaje.calcularDaño(50, 30));

            //Defensa mayor que ataque
            assertEquals(0, personaje.calcularDaño(30, 50));

            //Ataque igual a defensa
            assertEquals(0, personaje.calcularDaño(40, 40));

            //Ataque negativo
            assertEquals(0, personaje.calcularDaño(-10, 20));

            //Defensa negativa
            assertEquals(60, personaje.calcularDaño(50, -10));
        }

        @Test
        public void testEstaVivo() {
            Personaje personaje = new Personaje();

            //Salud positiva
            assertTrue(personaje.estaVivo(100));

            //Salud igual a 0 (muerto)
            assertFalse(personaje.estaVivo(0));

            //Salud negativa (muerto)
            assertFalse(personaje.estaVivo(-10));

            //Salud pequeña pero positiva (vivo)
            assertTrue(personaje.estaVivo(1));
        }
    }

