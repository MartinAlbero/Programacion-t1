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
        //ejercicio9(sc);
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
        System.out.println("En código Astrcii: " + (int)letra);
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
         Scaner sc = new Scaner(Systeam.in);
    System.out.print("introduce tu edad");
    int edad = sc.nextInt();
        System.out.print("introduce tus ingresos");
    float ingresos = sc.nextFloat();
    if(edad<18 || edad<=25 && ingreros < 900){
        System.out.println("Tienes acceso a la Beca");}
    else{
        System.out.println("No tienes beca");
    }   
       
    }
    public static void ejercicio11(){
        Scaner sc = new Scaner(Systeam.in);
    System.out.print("introduce tu nota");
    float nota = sc.nextFloat();
        //para la proxima obede a un sistema opresor, usa un swich en vez de tu amado else if ToT
        if(nota< 5){
            System.out.println("suspendido");}
        else if(nota>=5 && nota<6){
            System.out.println("Sufuciente");}
        else if(nota>=6 && nota<7){
            System.out.println("Bien");}
        else if(nota>=7 && nota<9){
            System.out.println("Notable");}
        else{
            System.out.print("Sobresaliente");}
        
        switch((int)nota){
            case 0,1,2, 3, 4:
                System.out.println("insufuciente");
                break;
            case 5:
                System.out.println("sufuciente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Fuera de Rango");
            
                
        }
        }
            
    }
    public static void ejercicio12(){
        Systeam.out.println("Estado: ");
        int temperatura = 31;
        System.out.print(temperatura > 30? "Calor" : "Normal");
        
    }
    public static void ejercicio13(){
            Scaner sc = new Scaner(Systeam.in);
    System.out.print("introduce un numero: ");
    int num = sc.nextInt();
    switch((int)num){
            case 1:
            System.out.println("Lunes");
            break;
            case 2:
            System.out.println("Martes");
            break;
            case 3:
            System.out.println("Miercoles");
            break;
            case 4:
            System.out.println("Jueves");
            break;
            case 5:
            System.out.println("Viernes");
            break;
            case 6:
            System.out.println("Sabado");
            break;
            case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.print("Fuera de rango");
    }
    }
 public static void ejercicio14(){
         Scaner sc = new Scaner(Systeam.in);
    System.out.print("introduce el numero del mes: ");
    int mes = sc.nextInt();
     System.out.println("introduce el anio");
     int anio = sc.nextInt();
     boolean esBisiesto = ((anio%4 == 0 && anio%100 != 0) || anio%400 == 0);
    switch((int)mes){
            case 1, 3, 5, 7, 8, 10, 12:
            System.out.println("Tiene 31");
            break;
            case 4, 6, 9, 11:
            System.out.println("Tiene 30");
            break;
            case 2:
            System.out.println("Tiene 28, 29 si es bisiesto");
            break;
        default:
            System.out.print("Fuera de rango");
    }
    }
 public static void ejerciciocond(){
        Scaner sc = new Scaner(Systeam.in);
        float precio = 10.00f;
        System.out.print("Introduce el numero del dia: ");
        String dia = sc.nextLine();
        if(dia = "Miercoles"){
            precio = 5;}
        }
        else if(dia = "Martes"){
            precio = 8;}
        }
        else if(dia = "Sábado" || dia = "Domingo"){
         prcio = 12;}
        }
        else{}
         System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        if(edad<12){
            precio = precio - precio*0.2;}
        else if(edad>=65){
            precio = precio - precio*0.3;}
        else{}
        System.out.print("Introduce si eres VIP: ");
        boolean vip = sc.nextBoolean();
        if(vip = true){
            precio = precio - precio*0.1;}
        else{}
System.out.println("Precio final" + precio);
}
 public static void ejercicio15(){
        Scaner sc = new Scaner(Systeam.in);
     System.out.print("Introduce un numero: ");
         int num = sc.nextInt();
         boolean par;
         
    }
public static void ejercicioClase2(scaner sc){
Scaner sc = new Scaner(Systeam.in);
System.out.print("Introduce el numero 1: ");
int num1 = sc.nextInt();
System.out.print("Introduce el numero 2: ");
int num2 = sc.nextInt();
System.out.print("Introduce el numero 3: ");
int num3 = sc.nextInt();
if(num1 != num2 && num1 != num3 && num2 !=num3){
    if(num1 > num2 && num1 > num3){
        System.out.println(num1 + "es el más grande");
    }
    else if(num2 > num1 && num2 > num3){
        System.out.println(num2 + "es el más grande");
    }
    else{
        System.out.println(num3 + "es el más grande");
    }
    if(num1 < num2 && num1 < num3){
        System.out.println(num1 + "es el más pequeño");
    }
    else if(num2 < num1 && num2 < num3){
        System.out.println(num2 + "es el más pequeño");
    }
    else{
        System.out.println(num3 + "es el más pequeño");
    }
}
else{
    System.out.println("uno de lso numeros se repite");
}

}
 public static void ejercicio15(scaner sc){
    int num = 1;
    int i = 0;
    int suma = 0;
       
            while(num > 0){
                System.out.print("introduce el numero: ");
                 num = sc.nextInt(); 
                if(num<0){
                    System.out.print("Error has introducido un numeroo negativo");
                }
                else{
                    i = i +1;
                    suma = suma + num;
                }
            }
     System.out.print("El nuemero de numeros introducidos" + i + "la suma de todos los numeros" + suma );    
     }
    }
}
