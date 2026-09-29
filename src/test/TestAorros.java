package test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAorros {
	public static void main(String[] args) {
        double montoAhorro = 100.0;

        // Paso 1: Padre
        Padre padre = new Padre("Carlos", "Trabajador", "Enojón");
        padre.ahorrar(montoAhorro);
        System.out.println("Padre: " + padre);

        // Paso 2: Hija
        Hija hija = new Hija("Sofia", "Alegre", "Distraída");
        hija.ahorrar(montoAhorro);
        System.out.println("Hija: " + hija);

        // Paso 3 y Parte 4: Hijo (ahorra solo el 50%)
        Hijo hijo = new Hijo("Lucas", "Creativo", "Desordenado", 10);
        hijo.ahorrar(montoAhorro);
        System.out.println("Hijo: " + hijo);
    }
}
