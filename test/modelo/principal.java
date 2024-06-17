/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class principal {

    public static void main(String[] args) {
   
//        menu();
        menu();
      
    }

    static public void menu() {

        //Conexion.abrirConexion();
        //Conexion.cerrarConexion();
        AdminClienteDB objAdmClienteDB = new AdminClienteDB();
       

        Scanner leerOpcion = new Scanner(System.in);
        Scanner leerTexto = new Scanner(System.in);
        Scanner leerNumero = new Scanner(System.in);
        String opcion = "";
        String opcionCliente = "";
        String opcionVehiculo = "";
        String opcionMecanico = "";
        String opcionRepuesto = "";
        String opcionObservacion = "";
        String opcionReparacion = "";

        boolean salir = false;
        boolean salirCliente = false;
        boolean salirVehiculo = false;
        boolean salirMecanico = false;
        boolean salirRepuesto = false;
        boolean salirObservacion = false;
        boolean salirReparacion = false;

        while (!salir) {
            opcion = "";
            System.out.println("\n---- MENÚ PRINCIPAL ----\n");
            System.out.println("1. Administrar Cliente");
          
            System.out.println("7. Salir");
            System.out.print("\nIngrese opción: ");
            opcion = leerOpcion.nextLine();

            switch (opcion) {
                case "1"://1. Administrar Cliente
                    while (!salirCliente) {
                        opcionCliente = "";
                        System.out.println("\n---- ADMINISTRAR CLIENTE ----\n");
                        System.out.println("1. Agregar cliente");
                        System.out.println("2. Mostrar todo los clientes");
                        System.out.println("3. Mostrar un solo cliente");
                        System.out.println("4. Actualizar cliente");
                        System.out.println("5. Eliminar cliente");
                        System.out.println("6. Salir");
                        System.out.print("\nIngrese opción: ");
                        opcionCliente = leerOpcion.nextLine();

                        switch (opcionCliente) {
                            case "1":  //1. Agregar Cliente

                                Cliente objCliente = new Cliente();
                                System.out.print("\nIngrese el documento del cliente: ");
                                objCliente.setDoc(leerTexto.nextLine());
                                System.out.print("\nIngrese el nombre completo del cliente: ");
                                objCliente.setNom_completo(leerTexto.nextLine());
                                System.out.print("\nIngrese la direccion del cliente: ");
                                objCliente.setDirecc(leerTexto.nextLine());
                                System.out.print("\nIngrese el telefono del cliente: ");
                                objCliente.setTelefono(leerTexto.nextLine());
                                System.out.print("\nIngrese el correo del cliente: ");
                                objCliente.setCorreo(leerTexto.nextLine());

                                objAdmClienteDB.insertar(objCliente);
                                break;

                            case "2": //2. Mostrar todos los clientes:
                                for (Object obj : objAdmClienteDB.listarTodo()) {
                                    Cliente objCliente1 = (Cliente) obj;
                                    System.out.println(objCliente1);
                                }
                                break;
                            case "3": //3. Mostrar un solo cliente:

                                Cliente objCliente2 = new Cliente();

                                System.out.print("Ingrese el id del cliente: ");
                                objCliente2.setIdc(leerNumero.nextInt());

                                objAdmClienteDB.listarUno(objCliente2);

                                System.out.println(objCliente2);

                                break;

                            case "4": // Actualizar una cliente:
                                Cliente objCliente3 = new Cliente();
                                System.out.print("Digite el id del cliente a actualizar: ");
                                objCliente3.setIdc(leerNumero.nextInt());

                                // Buscar el cliente en la base de datos
                                objCliente3 = (Cliente) objAdmClienteDB.listarUno(objCliente3);

                                if (objCliente3.getIdc() == 0) {
                                    System.out.println("El cliente no existe.");
                                } else {
                                    // Mostrar información del cliente antes de actualizar
                                    System.out.println("Cliente actual:");
                                    System.out.println("ID: " + objCliente3.getIdc());
                                    System.out.println("Documento: " + objCliente3.getDoc());
                                    System.out.println("Nombre: " + objCliente3.getNom_completo());
                                    System.out.println("Dirección: " + objCliente3.getDirecc());
                                    System.out.println("Telefono: " + objCliente3.getTelefono());
                                    System.out.println("Correo: " + objCliente3.getCorreo());

                                    // Pedir al usuario el nuevo documento del cliente
                                    System.out.print("Digite el nuevo documento del cliente: ");
                                    String nuevoCliente = leerTexto.nextLine();

                                    // Pedir al usuario el nuevo nombre del cliente
                                    System.out.print("Digite el nuevo nombre del cliente: ");
                                    String nuevoCliente1 = leerTexto.nextLine();

                                    // Pedir al usuario la nueva dirección del cliente
                                    System.out.print("Digite la nueva dirección del cliente: ");
                                    String nuevoCliente2 = leerTexto.nextLine();

                                    // Pedir al usuario la nueva telefono del cliente
                                    System.out.print("Digite la nueva telefono del cliente: ");
                                    String nuevoCliente3 = leerTexto.nextLine();

                                    // Pedir al usuario el nueva correo del cliente
                                    System.out.print("Digite el nuevo correo del cliente: ");
                                    String nuevoCliente4 = leerTexto.nextLine();

                                    // Actualizar el cliente en la base de datos
                                    objCliente3.setDoc(nuevoCliente);
                                    objCliente3.setNom_completo(nuevoCliente1);
                                    objCliente3.setDirecc(nuevoCliente2);
                                    objCliente3.setTelefono(nuevoCliente3);
                                    objCliente3.setCorreo(nuevoCliente4);

                                    if (objAdmClienteDB.actualizar(objCliente3)) {
                                        System.out.println("Cliente actualizado exitosamente.");
                                    } else {
                                        System.out.println("Error al actualizar al cliente.");
                                    }
                                }

                                break;

                            case "5":  //5. Eliminar un Cliente:

                                Cliente objCliente4 = new Cliente();
                                System.out.print("\nIngrese el id del cliente: ");
                                objCliente4.setIdc(leerNumero.nextInt());

                                if (objAdmClienteDB.eliminar(objCliente4)) {
                                    System.out.println("El cliente se eliminó con exito.");
                                } else {
                                    System.out.println("Error al eliminar el cliente.");
                                }
                                break;

                            case "6": //6. Salir
                                salirCliente = true;
                                break;
                            default:
                                System.out.println("\nCliente - Error: No existe opción. Por favor, inténtelo nuevamente. \n");
                        }
                    }

                    salirCliente = false;
                    break;

               

                case "7": //7. Salir
                    salir = true;
                    break;
                default:
                    System.out.println("\n - Error: No existe opción. Por favor, inténtelo nuevamente. \n");
            }
        }
    }

}