package com.inforcap.test;

import com.inforcap.desafioumlautomotora.Automovil;
import java.util.EnumMap;

public class TestJava {

    private static Automovil automovil;

    enum Days { 
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
    } 
    

    public static void setAutomovil(Automovil automovil) {
        TestJava.automovil = automovil;
        TestJava.automovil.setColor("Rojo");

    }

    public static Automovil getAutomovil() {
        return automovil;
    }

    private static String marca;

    public static void setMarca(String marca) {
        TestJava.marca = marca;
    }

    public static String getMarca() {
        return marca;
    }



    public static void main(String[] args) {
        Automovil myAutomovil = new Automovil();



        TestJava.setAutomovil(myAutomovil);


        EnumMap<Days, String> schedule = new EnumMap<>(Days.class); 
          
        // Adding elements to the EnumMap 
        schedule.put(Days.MONDAY, "Work"); 
        schedule.put(Days.TUESDAY, "Work"); 
        schedule.put(Days.WEDNESDAY, "Study"); 
        schedule.put(Days.THURSDAY, "Study"); 
        schedule.put(Days.FRIDAY, "Relax"); 
          
        // Getting elements from the EnumMap 
        System.out.println(schedule.get(Days.MONDAY)); // Output: Work 
        System.out.println(schedule.get(Days.FRIDAY));

        System.out.println(TestJava.getAutomovil().getColor());
    }

}
