package registroLibro;

import java.util.Objects;

public class LibroBib {
    private String isbn,titulo,autor,dia,mes,anio,status,edicion;

    public LibroBib() {
    }
    public LibroBib(String isbn, String titulo, String autor, String dia, String mes, String anio, String status, String edicion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.status = status;
        this.edicion = edicion;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.isbn);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LibroBib other = (LibroBib) obj;
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Informacion del libro: "+titulo + 
                "\n Isbn: " + isbn + 
                "\n Titulo: " + titulo + 
                "\n Autor: " + autor + 
                "\n Fecha de edicion: " + dia + "/" + mes + "/" + anio + 
                "\n Estatus: " + status + 
                "\n Edicion: " + edicion ;
    }
    
    
}
