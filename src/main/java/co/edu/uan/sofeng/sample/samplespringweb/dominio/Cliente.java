
package co.edu.uan.sofeng.sample.samplespringweb.dominio;

//@author yeisonfernando

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private int identificacion;
    private String nomCliente;
    private String apeCliente;
    private String dirCliente;
    private String ciudadCliente;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="cliente") //Crear relacion uno a mucho
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    
    protected Cliente (){
    }
    
    //Constructor para crear instancias de Cliente para guardar en la base de datos.
    public Cliente(String nomCliente, String apeCliente) {    
        this.nomCliente = nomCliente;
        this.apeCliente = apeCliente;
        
    }
    
    public Cliente(String nomCliente) {
        this.nomCliente = nomCliente;

    }

    @Override
    //Método para imprimir las propiedades del cliente.
    public String toString() {
        return String.format("Cliente(idCliente: %d,identificacion: %d, nomCliente: %s, apeCliente: %s, dirCliente: %s, ciudadCliente: %s, pedidos: %s",
               idCliente, identificacion, nomCliente, apeCliente, dirCliente, ciudadCliente, pedidos);
    }
    
    

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getApeCliente() {
        return apeCliente;
    }

    public void setApeCliente(String apeCliente) {
        this.apeCliente = apeCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
    public void addPedido(String fecha, Long cantidad, Float valorPedido) {
        Pedido p = new Pedido(this, fecha, cantidad, valorPedido);
        pedidos.add(p);
    }
      //PREGUNTAR
    
}
