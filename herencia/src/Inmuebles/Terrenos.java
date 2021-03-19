package Inmuebles;

public class Terrenos  extends fatherinmuebles {
    Float Mcuadrados;
    String  Ubicación;

    public Float getMcuadrados() {
        return Mcuadrados;
    }
    public void setMcuadrados(Float mcuadrados) {
        Mcuadrados = mcuadrados;
    }
    public String getUbicación() {
        return Ubicación;
    }
    public void setUbicación(String ubicación) {
        Ubicación = ubicación;
    }
    public Terrenos(){
        super();
    }



    public Terrenos(String fechaAdquirida, int numerolote, String ultimodueño, int idregistro, Float mcuadrados, String ubicación) {
        super(fechaAdquirida, numerolote, ultimodueño, idregistro);
        Mcuadrados = mcuadrados;
        Ubicación = ubicación;
    }
}
