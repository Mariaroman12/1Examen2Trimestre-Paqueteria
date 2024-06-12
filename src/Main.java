import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        System.out.println("Bienvenido al sistema de gestión de paquetes.");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear un paquete");
            System.out.println("2. Agregar un producto a un paquete");
            System.out.println("3. Borrar un paquete");
            System.out.println("4. Mostrar paquetes");
            System.out.println("5. Mostrar paquetes por estado");
            System.out.println("6. Listar productos de un paquete");
            System.out.println("7. Buscar producto en un paquete");
            System.out.println("8. Borrar producto de un paquete");
            System.out.println("9. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el localizador del paquete: ");
                    String localizador = scanner.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese el DNI del cliente: ");
                    String dniC = scanner.nextLine();
                    System.out.print("Ingrese la fecha de envío (YYYY-MM-DD): ");
                    String fechaEnvio = scanner.nextLine();
                    System.out.print("Ingrese los días de entrega: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea
                    System.out.print("Ingrese el estado del paquete: ");
                    String estado = scanner.nextLine();
                    empresa.crearPaquete(localizador, direccion, dniC, fechaEnvio, dias, estado);
                    break;
                case 2:
                    System.out.print("Ingrese el localizador del paquete: ");
                    localizador = scanner.nextLine();
                    System.out.print("Ingrese el código del producto: ");
                    String codProd = scanner.nextLine();
                    System.out.print("Ingrese la descripción del producto: ");
                    String desc = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cant = scanner.nextInt();
                    System.out.print("Ingrese el peso: ");
                    float peso = scanner.nextFloat();
                    empresa.addProducto(codProd, desc, cant, peso, localizador);
                    break;
                case 3:
                    System.out.print("Ingrese el localizador del paquete a borrar: ");
                    localizador= scanner.nextLine();
                    empresa.borrarPaquete(localizador);
                    break;
                case 4:
                    System.out.println("Lista de paquetes:");
                    System.out.println(empresa.mostrarPaquetes());
                    break;
                case 5:
                    System.out.print("Ingrese el estado de los paquetes a mostrar: ");
                    estado = scanner.nextLine();
                    System.out.println("Paquetes en estado '" + estado + "':");
                    System.out.println(empresa.mostrardeotraforma(estado));
                    break;
                case 6:
                    System.out.print("Ingrese el localizador del paquete a listar productos: ");
                    localizador = scanner.nextLine();
                    System.out.println(empresa.listarProductoss(localizador));
                    break;
                case 7:
                    System.out.print("Ingrese el localizador del paquete: ");
                    localizador = scanner.nextLine();
                    System.out.print("Ingrese el código del producto a buscar: ");
                    codProd = scanner.nextLine();
                    if (empresa.buscarProducto(localizador, codProd)) {
                        System.out.println("El producto está presente en el paquete.");
                    } else {
                        System.out.println("El producto no está presente en el paquete.");
                    }
                    break;
                case 8:
                	System.out.println("Introduzca el localizados del paquete");
                	localizador = scanner.nextLine();
                	System.out.println("Introduzca el código del producto que quieres eliminar");
                	codProd=scanner.nextLine();
                	empresa.borrarProductoo(localizador, codProd);
                	break;
                case 9:
                    System.out.println("Saliendo del sistema.");
                    return;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
}