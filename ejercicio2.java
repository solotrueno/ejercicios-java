import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[]args){
        //Mensaje de bienvenida
        System.out.println("Bienvenido a claro hablas con tu bot personalizado cuentame en que te puedo ayudar el dia de hoy\uD83D\uDE0A?");
        Scanner sc = new Scanner(System.in);
        //pedir numero de cedula
        System.out.println("Por favor ingresa tu numero de cedula");
        String cedula = sc.nextLine(); //se guarda como texto
        System.out.println("Gracias," + cedula + "ha sido registrada.");
        System.out.println("--------------------------------------");
        //Mostramos las opciones al usuario
        System.out.println("Por favor elige una opcion");
                System.out.println("1)Plan movil");
                System.out.println("2)Plan hogar");
                System.out.println("3)Certificados");
                System.out.println("4)Comuncicate con un asesor");
        System.out.println("________________________________");
                //leemos las opciones que escribe el usuario
        int opcion = sc.nextInt();
                //evaluamos la opcion
        switch (opcion){
            case 1: System.out.println("Has seleccionado plan movil");
            break;
            case 2: System.out.println("Has seleccionado plan hogar");
            break;
            case 3: System.out.println("Has seleccionado Certificados");
            break;
            case 4: System.out.println("Has seleccionado comunicarte con un asesor");
            break;
            default: System.out.println("opcion no valida");
            break;
            //mensaje final

        }
        System.out.println("______________________________");
        System.out.println("Gracias, te comunicare con un asesor");
    }
}
