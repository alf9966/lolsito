package org.Torturita;

public class Direccion {
    String Ciudad;
    String Referencia;
    String Numero;
    int Identificador;
    Jiron jiron = new Jiron("");
    Calle calle = new Calle("");
    Avenida avenida = new Avenida("");
    Pasaje pasaje = new Pasaje("");
    public Direccion(String ciudad, String numero, int Identificador, String referencia) {
        super();
        this.Ciudad = ciudad;
        this.Numero = numero;
        this.Identificador = Identificador;
        this.Referencia = referencia;
        if (this.Identificador == 1)
        {
            this.jiron.setJiron(referencia);
        }
        else if (this.Identificador == 2)
        {
            this.calle.setCalle(referencia);
        }
        else if (this.Identificador == 3)
        {
            this.pasaje.setPasaje(referencia);
        }
        else
        {
            this.avenida.setAvenida(referencia);
        }
    }

    public Direccion(String ciudad, String numero, String avenida)
    {
        super();
        this.Ciudad = ciudad;
        this.Numero = numero;
        this.avenida.setAvenida(avenida);
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getNumero() { return Numero; }
    public void setNumero(String numero) {
        Numero = numero;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int identificador) {
        Identificador = identificador;
    }

}

class Jiron{
    String Jiron;

    public Jiron(String Jiron) {
        this.Jiron = Jiron;
    }
    public String getJiron() {
        return Jiron;
    }
    public void setJiron(String jiron) {
        Jiron = jiron;
    }
}

class Calle{
    String Calle;

    public Calle(String Calle) {
        this.Calle = Calle;
    }
    public String getCalle() {
        return this.Calle;
    }
    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
}

class Pasaje{
    String Pasaje;

    public Pasaje(String Pasaje) {
        this.Pasaje = Pasaje;
    }
    public String getPasaje() {
        return this.Pasaje;
    }
    public void setPasaje(String Pasaje) {
        this.Pasaje = Pasaje;
    }
}

class Avenida{
    String Avenida;

    public Avenida(String Avenida) {
        this.Avenida = Avenida;
    }
    public String getAvenida() {
        return this.Avenida;
    }
    public void setAvenida(String Avenida) {
        this.Avenida = Avenida;
    }
}


