package TestCOD;

public class Personaje {

        // Método para calcular el daño
        public int calcularDaño(int ataque, int defensa) {
            int daño = ataque - defensa;
            return daño > 0 ? daño : 0; // Si el daño es negativo devuelve 0
        }
        // Método para ver si un personaje está vivo o no
        public boolean estaVivo(int salud) {
            return salud > 0;
        }
    }

