
package co.edu.uan.sofeng.sample.samplespringweb.dominio;

//@author yeisonfernando

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogin;
    
    private String usuario;
    private String contraseña;

    
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConraseña() {
        return contraseña;
    }

    public void setConraseña(String conraseña) {
        this.contraseña = conraseña;
    }

    public Long getId() {
        return idLogin;
    }

    public void setId(Long id) {
        this.idLogin = id;
    }
           
}
