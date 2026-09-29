package com.krakedev.herencia;

public class Hijo extends Padre {
    private int juguetes;

    // Constructor
    public Hijo(String nombre, String virtudes, String defectos, int juguetes) {
        super(nombre, virtudes, defectos);
        this.juguetes = juguetes;
    }

    // Getters y Setters para juguetes
    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

    // Sobreescritura inteligente de ahorrar() - Parte 4
    @Override
    public void ahorrar(double monto) {
        super.ahorrar(monto * 0.50);
    }

    // Sobreescritura de toString() - Parte 1
    @Override
    public String toString() {
        return super.toString() + ", Juguetes: " + juguetes;
    }
}