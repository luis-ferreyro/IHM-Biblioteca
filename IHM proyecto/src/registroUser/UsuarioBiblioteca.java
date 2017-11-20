package registroUser;

import java.util.Objects;


public class UsuarioBiblioteca {
    private String nombre,apellido1,apellido2,anio,mes,dia,usuario,calle,telefono;

    public UsuarioBiblioteca(String nombre, String apellido1, String apellido2, String anio, String mes, String dia, String usuario, String calle, String telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
       
        this.usuario = usuario;
        this.calle = calle;
        this.telefono = telefono;
    }
    public UsuarioBiblioteca(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.usuario);
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
        final UsuarioBiblioteca other = (UsuarioBiblioteca) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    
    

    
    @Override
    public String toString() {
        return "\n\nDescripcion del usuario: "+usuario+ 
                    "\nNombre: " + nombre + 
                    "\nApellido1: " + apellido1 + 
                    "\nApellido2: " + apellido2 + 
                    "\nFecha de nacimiento: " + anio + "/" + mes + "/" + dia + 
                    "\nTelefono: "+telefono;
                    
    }

    
    
    
    

}
