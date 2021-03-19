package Inmuebles;

import Inmuebles.fatherinmuebles;

public class Departamentos  extends fatherinmuebles {
    int  Numeroabit;
    int Nuberobaño;
    int Amenidades;

    public int getNumeroabit() {
        return Numeroabit;
    }

    public void setNumeroabit(int numeroabit) {
        Numeroabit = numeroabit;
    }

    public int getNuberobaño() {
        return Nuberobaño;
    }

    public void setNuberobaño(int nuberobaño) {
        Nuberobaño = nuberobaño;
    }

    public int getAmenidades() {
        return Amenidades;
    }

    public void setAmenidades(int amenidades) {
        Amenidades = amenidades;
    }

    public Departamentos(){
        super();
    }



    public Departamentos(String fechaAdquirida, int numerolote, String ultimodueño, int idregistro, int numeroabit, int nuberobaño, int amenidades) {
        super(fechaAdquirida, numerolote, ultimodueño, idregistro);
        Numeroabit = numeroabit;
        Nuberobaño = nuberobaño;
        Amenidades = amenidades;
    }
}
