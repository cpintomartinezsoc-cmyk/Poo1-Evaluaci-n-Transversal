package model;

import utils.RutInvalidoException;

public class Rut {

    private String rut;

    public Rut(String rut) throws RutInvalidoException {

        if(rut == null || rut.isEmpty()){

            throw new RutInvalidoException("El RUT no puede estar vacío.");

        }

        this.rut = rut;

    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {

        this.rut = rut;

    }

    @Override
    public String toString() {

        return rut;

    }
}