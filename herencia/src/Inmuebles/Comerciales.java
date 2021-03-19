package Inmuebles;

import Inmuebles.fatherinmuebles;

public class Comerciales extends fatherinmuebles {


    public Comerciales(){
        super();
    }
    public Comerciales(String fechaAdquirida, int numerolote, String ultimodueño, int idregistro, String construccionfecha, String fechadeinspección) {
        super(fechaAdquirida, numerolote, ultimodueño, idregistro);
        Construccionfecha = construccionfecha;
        Fechadeinspección = fechadeinspección;
    }

    public String getConstruccionfecha() {
        return Construccionfecha;
    }

    public void setConstruccionfecha(String construccionfecha) {
        Construccionfecha = construccionfecha;
    }

    String Construccionfecha;

    public String getFechadeinspeccion() {
        return Fechadeinspección;
    }

    public void setFechadeinspección(String fechadeinspección) {
        Fechadeinspección = fechadeinspección;
    }

    String Fechadeinspección;


}
