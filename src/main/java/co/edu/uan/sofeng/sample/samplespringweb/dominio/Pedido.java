
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private String fecha;
    private float cantidad; //PREGUNTAR SI EL TIPO DE VARIABLE ESTA BIEN
    
    @ManyToOne(optional=false) //relacion muchos a uno
    @JoinColumn(name="Cliente_id", nullable=false) 
    private Cliente cliente;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="pedido")
    private List<Producto> productos = new ArrayList<Producto> ();
    
    protected Pedido (){
    }

    public Pedido(Cliente cliente, String fecha, float cantidad) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString (){
        return String.format("Pedido (idPedido: %d, cliente: %s , fecha: %s, cantidad: %d, productos: %s",
                idPedido, cliente.getIdCliente() ,fecha, cantidad, productos);
    }
    
    
    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
               
}
