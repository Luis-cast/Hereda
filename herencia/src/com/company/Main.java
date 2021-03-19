package com.company;
import java.util.ArrayList;
import Inmuebles.Comerciales;
import Inmuebles.fatherinmuebles;
import Inmuebles.Departamentos;
import Inmuebles.Terrenos;

import javax.swing.*;


public class Main {


    public static void main(String[] args) {
        System.out.println("La información de las dos tiendas comerciales es la siguiente: ");
        Comerciales cm = new Comerciales(" Fecha de adquisición 10/20/2021",1,"Ultimo dueño: Juan",10,"Fecha de construcción 12/20/2021","Fecha de Inspección 12/30/2021" );
        Comerciales cmdos = new Comerciales(" Fecha de adquisición 11/20/2022",2,"Ultimo dueño: Anibal",11,"Fecha de construcción 12/10/2022","Fecha de Inspección 12/30/2022" );
        System.out.println("Comercio 1 : "+ cm.getFechaAdquirida() +" Numero de lote  "+ cm.getNumerolote()+"  "+cm.getUltimodueño()+" Identificador de registro  "+cm.getIdregistro()+"  "+cm.getConstruccionfecha()+" "+ cm.getFechadeinspeccion());
        System.out.println("Comercio 2 : "+ cmdos.getFechaAdquirida() +" Numero de lote  "+ cmdos.getNumerolote()+"  "+cmdos.getUltimodueño()+" Identificador de registro  "+cmdos.getIdregistro()+"  "+cmdos.getConstruccionfecha()+" "+ cmdos.getFechadeinspeccion());
        System.out.println("La información de los tres  Deparamentos es la siguiente: ");
        Departamentos dep = new Departamentos(" Fecha de adquisición 10/20/2021",111,"Alexis",24,4,2,4);
        Departamentos depd = new Departamentos(" Fecha de adquisición 10/22/2021",4,"Juan",33,4,2,4);
        Departamentos dept = new Departamentos(" Fecha de adquisición 10/24/2021",5,"Joan",24,4,2,4);

        System.out.println("Departamento 1: " +dep.getFechaAdquirida() +" Numero de lote  "+ dep.getNumerolote()+" Ultimo dueño  "+dep.getUltimodueño()+" Identificador de registro  "+dep.getIdregistro()+" Numero de habitaciones "+dep.getNumeroabit()+" Numero de Baños "+ dep.getNuberobaño()+" Numero de amenidades "+ dep.getAmenidades());
        System.out.println("Departamento 2: " +depd.getFechaAdquirida() +" Numero de lote  "+ depd.getNumerolote()+" Ultimo dueño  "+depd.getUltimodueño()+" Identificador de registro  "+depd.getIdregistro()+" Numero de habitaciones "+depd.getNumeroabit()+" Numero de Baños "+ depd.getNuberobaño()+" Numero de amenidades "+ depd.getAmenidades());
        System.out.println("Departamento 3: " +dep.getFechaAdquirida() +" Numero de lote  "+ dept.getNumerolote()+" Ultimo dueño  "+dept.getUltimodueño()+" Identificador de registro  "+dept.getIdregistro()+" Numero de habitaciones "+dept.getNumeroabit()+" Numero de Baños "+ dept.getNuberobaño()+" Numero de amenidades "+ dept.getAmenidades());

        System.out.println("La información de los cinco  Terrenos es la siguiente: ");
        Terrenos ter = new Terrenos(" Fecha de adquisición 10/20/2021",1131,"Johan",243,12.0f,"Panamá");
        Terrenos terd = new Terrenos(" Fecha de adquisición 11/20/2021",11431,"Marco",242,13.0f,"Panamá");
        Terrenos tert = new Terrenos(" Fecha de adquisición 12/20/2021",1631,"Luis",241,10.2f,"Panamá");
        Terrenos terc = new Terrenos(" Fecha de adquisición 13/20/2021",17381,"Ernesto",2455,11.3f,"Panamá");
        Terrenos teri = new Terrenos(" Fecha de adquisición 15/20/2021",11311,"Johan",2442,15.1f,"Panamá");
        System.out.println("Terreno 1: " +ter.getFechaAdquirida() +" Numero de lote  "+ ter.getNumerolote()+" Ultimo dueño  "+ter.getUltimodueño()+" Identificador de registro  "+ter.getIdregistro()+" Metros Cuadrados "+ter.getMcuadrados()+" Ubicación "+ ter.getUbicación());
        System.out.println("Terreno 2: " +terd.getFechaAdquirida() +" Numero de lote  "+ terd.getNumerolote()+" Ultimo dueño  "+terd.getUltimodueño()+" Identificador de registro  "+terd.getIdregistro()+" Metros Cuadrados "+terd.getMcuadrados()+" Ubicación "+ terd.getUbicación());
        System.out.println("Terreno 3: " +tert.getFechaAdquirida() +" Numero de lote  "+ tert.getNumerolote()+" Ultimo dueño  "+tert.getUltimodueño()+" Identificador de registro  "+tert.getIdregistro()+" Metros Cuadrados "+tert.getMcuadrados()+" Ubicación "+ tert.getUbicación());
        System.out.println("Terreno 4: " +terc.getFechaAdquirida() +" Numero de lote  "+ terc.getNumerolote()+" Ultimo dueño  "+terc.getUltimodueño()+" Identificador de registro  "+terc.getIdregistro()+" Metros Cuadrados "+terc.getMcuadrados()+" Ubicación "+ terc.getUbicación());
        System.out.println("Terreno 5: " +teri.getFechaAdquirida() +" Numero de lote  "+ teri.getNumerolote()+" Ultimo dueño  "+teri.getUltimodueño()+" Identificador de registro  "+teri.getIdregistro()+" Metros Cuadrados "+teri.getMcuadrados()+" Ubicación "+ terc.getUbicación());
    }
}
