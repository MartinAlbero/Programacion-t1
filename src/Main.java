//librerias
import java.util.scaner;
public class Main {
    public static void main(String args[]) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
    }

    public static void ejercicio1(){
        int ID = 8;
        int stock = 78;
        char letra = 'c';
        float precio = 56.3f;
        boolean rebajado = false;
        System.out.println("Producto: " + ID + letra + precio);
        if (rebajado) {
            System.out.print(" Rebajado");
        }
        else{
            System.out.print("Sin rebaja");
        }
    }

    public static void ejercicio2(){
        float IVA = 0.21f;
        int rebaja = 5;      
        float precio_1 = 120.0f;
        precio_1 = precio_1 + (precio_1*IVA) - rebaja;
        System.out.println("Precio del producto rebajado mas el IVA: " + precio_1); 

    }

    public static void ejercicio3(){
        int first_Num = 10;
        double precio_Final = 99.9f;
        boolean mayor_Edad = true;
        float pi_Valor = 3.1416f;
        System.out.println(first_Num);
        System.out.println(precio_Final);
        System.out.println(mayor_Edad);
        System.out.println( pi_Valor);

    }

    public static void ejercicio4(){
        double precioExacto = 49.99f;
        int precioEntero = (int)precioExacto;
        char letra = 'U';
        System.out.println("En código Astrcii: " + (int)letra)
    }

    public static void ejercicio5(){
        int seg = 3654;
        int min = segundos/60;
        int horas = minutos/60;
        int seg_res = segundos%60;
        int min_res = minutos%60;
        System.out.println( seg + " son: " + horas + " horas, " + min_res + " minutos, " + seg_res + " segundos" )

    }

    public static void ejercicio6(){
        boolean bist_year = (year%400 == 0);
        int year = 1465;
       
        //Condicionales
        if (year%4 == 0 && year%100 != 0 || year%400 == 0)
        {
            System.out.print("El anio es bisiesto");
        }
        else
        {
            System.out.print("El anio NO bisiesto");
        }
           //Solo se usa en booleanos
         System.out.print(bist_year ? "Opcion1" : "Opcion2");
        
    }
    public static void ejercicio7(){
        System.out.printf("%-15s %5s %8s\n", "Nombre", "Unidades", "Precio");
        System.out.printf("%-15s %5d %8.2f\n", "Producto", 567, 0.55);
    }

    public static void ejercicio8(){
        Systeam.out.println("MENÚ DE OPCIONES\n1.\tArchivo \"Nuevo\" \n2.\tRuta: C: \\\\Archivos\\\\Java\n3.\tSalir" )
    }

    public static void ejercicio9(){
    Scaner sc = new Scaner(Systeam.in);
    System.out.print("introduce tu edad");
    int edad = sc.nextInt();
    sc.nextLine(); //paar que use el \n
    System.out.print("Introduce tu nombre");   
    String nombre = nextLine();
    System.out.println("nombre: "+ nombre + ", Edad: " + edad + " años");
    }

    public static void ejercicio10(){
        
    }
}
