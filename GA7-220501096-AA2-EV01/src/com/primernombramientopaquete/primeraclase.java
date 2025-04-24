package com.primernombramientopaquete;

public class primeraclase {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        String NombroVariable = "Ejemplo de valor"; 
        int cantidadElementos = 10;    
        double precioUnitario = 19.99;         
        java.sql.Connection conexion;  
        
        System.out.println("Profe ejemplo de metodos:");
        obtenerDatosDeLaBaseDeDatos();
        insertarNuevoRegistro("ValorSena", 10);

        System.out.println(NombroVariable);
        System.out.println(cantidadElementos);
        System.out.println(precioUnitario);

    


    }
    //Declaro Metodos
    public static void obtenerDatosDeLaBaseDeDatos() {
        System.out.println("Obteniendo datos...");
    }

    public static boolean insertarNuevoRegistro(String valor, int cantidad) {
        System.out.println("Insertando registro con valor: " + valor + ", cantidad: " + cantidad);
        return true; 
    }

}

