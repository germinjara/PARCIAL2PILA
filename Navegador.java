import java.util.Stack;

public class Navegador {
    private Stack<PaginaWeb> Historial;

    public Navegador() {
        this.Historial = new Stack<>();
    }

    public void visitarNuevaPagina(String url, String titulo) {
        PaginaWeb nuevaPagina = new PaginaWeb(url, titulo);
        Historial.push(nuevaPagina);
        System.out.println("pagina agregada, visitando: " + titulo);
    }

    public void verHistorial() {
        if (Historial.isEmpty()) {
            System.out.println("el historial esta vacio");
            return;
        }
        
        System.out.println("\n--- historial de navegacion ---");
        for (int i = Historial.size() - 1; i >= 0; i--) {
            System.out.println(Historial.get(i).toString());
        }
    }

    public void modificarPaginaActual(String nuevaUrl, String nuevoTitulo) {
        if (Historial.isEmpty()) {
            System.out.println("no hay paginas en el historial para modificar.");
            return;
        }
        
        PaginaWeb paginaActual = Historial.peek();
        paginaActual.setUrl(nuevaUrl);
        paginaActual.setTitulo(nuevoTitulo);
        System.out.println("la pagina actual se modifico");
    }

    public void eliminarPila() {
        if (Historial.isEmpty()) {
            System.out.println("la pila ya esta vacia");
        } else {
            Historial.clear();
            System.out.println("se ha eliminado todo el historial de navegacion");
        }
    }
}