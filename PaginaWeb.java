import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaginaWeb {
    private String url;
    private String titulo;
    private LocalDateTime fechaAcceso;

    public PaginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
        this.fechaAcceso = LocalDateTime.now();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaAcceso() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return fechaAcceso.format(formatter);
    }

    @Override
    public String toString() {
        return "agina: " + titulo + " | URL: " + url + " | cceso: " + getFechaAcceso();
    }
}