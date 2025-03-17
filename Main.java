package TestCOD;

public class Main {
        public static void main(String[] args) {
            Personaje personaje = new Personaje();

            // Probar el método calcularDanio
            int danio1 = personaje.calcularDaño(50, 30);
            int danio2 = personaje.calcularDaño(30, 50);
            System.out.println("Daño 1 (50 de ataque, 30 de defensa): " + danio1);
            System.out.println("Daño 2 (30 de ataque, 50 de defensa): " + danio2);

            // Probar el método estaVivo
            boolean estaVivo1 = personaje.estaVivo(100);
            boolean estaVivo2 = personaje.estaVivo(0);
            System.out.println("¿Personaje 1 está vivo? (salud = 100): " + estaVivo1);
            System.out.println("¿Personaje 2 está vivo? (salud = 0): " + estaVivo2);


        }
    }

