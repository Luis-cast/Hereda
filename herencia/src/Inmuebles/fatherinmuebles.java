package Inmuebles;

public class fatherinmuebles {
   protected String FechaAdquirida;
    protected int Numerolote;
    protected String Ultimodueño;
    protected int Idregistro;

    public  fatherinmuebles(){

    }

    public fatherinmuebles(String fechaAdquirida, int numerolote, String ultimodueño, int idregistro) {
        FechaAdquirida = fechaAdquirida;
        Numerolote = numerolote;
        Ultimodueño = ultimodueño;
        Idregistro = idregistro;
    }

    public String getFechaAdquirida() {
        return FechaAdquirida;
    }

    public void setFechaAdquirida(String fechaAdquirida) {
        FechaAdquirida = fechaAdquirida;
    }

    public int getNumerolote() {
        return Numerolote;
    }

    public void setNumerolote(int numerolote) {
        Numerolote = numerolote;
    }

    public String getUltimodueño() {
        return Ultimodueño;
    }

    public void setUltimodueño(String ultimodueño) {
        Ultimodueño = ultimodueño;
    }

    public int getIdregistro() {
        return Idregistro;
    }

    public void setIdregistro(int idregistro) {
        Idregistro = idregistro;
    }


    }


