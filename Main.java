import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Navegador miNavegador = new Navegador();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- MENU DEL NAVEGADOR ---");
            System.out.println("1.visitar nueva pagina)");
            System.out.println("2.ver historial)");
            System.out.println("3.editar pagina actual");
            System.out.println("4.borrar todo el historial)");
            System.out.println("5.salir");
            System.out.print("elige una opxion de 1 a 5: ");
            
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ingresa la URL de la pagina: ");
                    String url = teclado.nextLine();
                    System.out.print("ingresa el titulo de la pagina: ");
                    String titulo = teclado.nextLine();
                    miNavegador.visitarNuevaPagina(url, titulo);
                    break;
                    
                case 2:
                    miNavegador.verHistorial();
                    break;
                    
                case 3:
                    System.out.print("ingresa la nueva URL: ");
                    String nuevaUrl = teclado.nextLine();
                    System.out.print("ingresa el nueva titulo: ");
                    String nuevoTitulo = teclado.nextLine();
                    miNavegador.modificarPaginaActual(nuevaUrl, nuevoTitulo);
                    break;
                    
                case 4:
                    miNavegador.eliminarPila();
                    break;
                    
                case 5:
                    System.out.println("cerrando el navegador, feliz dia!");
                    break;
                    
                default:
                    System.out.println("opcion no valida");
            }
        }
        
        teclado.close();
    }
}