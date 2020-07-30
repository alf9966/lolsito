package org.Torturita;

import javax.validation.constraints.Null;

public class Persona {

    String Nombres;
    String Apellidos;
    int Edad;
    Direccion direccion;

    public Persona(String nombres, String apellidos, int edad, String ciudad,
                   String numero, String referencia, int Identificador) {
        Nombres = nombres;
        Apellidos = apellidos;
        Edad = edad;
        direccion.setCiudad(ciudad);
        direccion.setIdentificador(Identificador);
        direccion.setNumero(numero);
        direccion.setReferencia(referencia);
    }
}
