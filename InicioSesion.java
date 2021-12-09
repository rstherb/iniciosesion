package iniciosesion;

/**
 *
 * @author Ruth Esther B.C
 */
        
import java.util.Scanner;

public class InicioSesion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, hobbie = "";
        String editorC, sistemaO = "";
        int edad = 100;
        
        
        System.out.println ("Bienvenido al Sistema");
        System.out.println ("Porfavor ingrese su Nombre:");
        nombre = entrada.next();
        System.out.println ("Porfavor ingrese su Apellido:");
        apellido = entrada.next();
        System.out.println ("Porfavor ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println ("Ingrese su Hobbie:");
        hobbie = entrada.next();
        System.out.println ("editor de código preferido");
        editorC = entrada.next();
        System.out.println ("sistema operativo que utiliza");
        sistemaO = entrada.next();

        
        System.out.println ("Los datos ingresados son:");
        System.out.println ("Su nombre se ha guardado como:" + nombre);
        System.out.println ("Su apellido se ha guardado como:" + apellido);
        System.out.println ("Su edad corresponde a:" + edad);     
        System.out.println ("Su hobbie se configuro como:" + hobbie);
        System.out.println ("El editor de código de su preferencia es:" + editorC);
        System.out.println ("Usted ingreso como su Sistema operativo a:" + sistemaO);
    }
    
}
