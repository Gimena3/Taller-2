/*
 * Copyright (c) 2023-2024. Departamento de Ingenieria de Sistemas y Computacion
 */
import cl.ucn.disc.poo.oasisrallhub.model.Trabajador;
import cl.ucn.disc.poo.oasisrallhub.model.Tren;
import cl.ucn.disc.poo.oasisrallhub.service.Sistema;
import cl.ucn.disc.poo.oasisrallhub.service.SistemaImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new SistemaImpl();
        Scanner scanner = new Scanner(System.in);
        String comenzar = "Si";

        System.out.println("REGISTARR TREN");

        while(comenzar.equals("Si")){
            System.out.println("Ingrese el identificador del tren (solo pueden ser 4 caracteres): ");
            String identificador = scanner.nextLine();
            System.out.println("Ingrese la ruta del tren (solo pueden ser A,B,C y D): ");
            String ruta = scanner.nextLine();
            System.out.println("Ingrese el precio del boleto (solo pueden ser menor a 10000):");
            int precio = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese la descripcion del tren:");
            String descripcion = scanner.nextLine();
            System.out.println("Si el tren esta en funcionamiento ingresar True en caso contrario false: ");
            boolean funcionamiento = Boolean.parseBoolean(scanner.nextLine());
            Tren nuevoTren = new Tren(identificador,ruta,precio,descripcion,funcionamiento);
            sistema.agregarTren(nuevoTren);

            System.out.println("Desea registrar otro tren?(Si o No):");
            comenzar = scanner.nextLine();

        }
        System.out.println("REGISTRAR TRABAJADORES");
        String iniciar = "Si";
        while(iniciar.equals("Si")){
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el cargo al cual corresponda (Conductor, Personal de servicio, Guardafreno o Jefe de tren)");
            String cargo = scanner.nextLine();
            System.out.println("Ingrese el monto del salario");
            int salario = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese los años de experiencia");
            int experiencia = Integer.parseInt(scanner.nextLine());
            Trabajador nuevoTrabajador = new Trabajador(nombre,apellido,cargo,salario,experiencia);
            sistema.agregarTrabajador(nuevoTrabajador);
            System.out.println("Desea registrar otro trabajador? (Si o No):");
            iniciar = scanner.nextLine();
        }

        System.out.println("ACTUALIZACION DEL FUNCIONAMIENTO");
        String abrir = "Si";
        while(abrir.equals("Si")){
            System.out.println("Ingrese el identificador del tren");
            String identificador = scanner.nextLine();
            System.out.println("¿Desea dejar el tren en funcionamiento?(Si es asi ponga True y si no False)");
            boolean funcionamiento = Boolean.parseBoolean(scanner.nextLine());

            sistema.actualizarFuncionamiento(identificador,funcionamiento);
            System.out.println("Desea actualizar el funcionamiento de otro tren? (Si o No):");
            abrir = scanner.nextLine();

        }

        System.out.println("ESTADISTICAS");
        sistema.porcentageTrenesInactivos();
        sistema.promedioPrecioTotal();
        sistema.sumaPreciosRuta();





    }
}