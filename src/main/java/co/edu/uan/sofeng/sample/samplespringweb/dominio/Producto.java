
package co.edu.uan.sofeng.sample.samplespringweb.dominio;

//@author yeisonfernando

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String distribuidora;
    private String nomProducto;
    private Long cantidad;
    private Float precio;
    
    @ManyToOne(optional=false) //relacion muchos a uno
    //@JoinColumn(name="pedido_id", nullable=false)
    private Pedido pedido;
    
    protected Producto(){
        
    }
    /* PREGUNTAR POR QUE NO ME DEJA INGRESAR DATOS
    private Producto (Pedido pedido, String distribuidora, String nomProducto, Long cantidad, Float Precio){
        this.pedido = pedido;
        this.distribuidora = distribuidora;
        this.nomProducto = nomProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
*/
    public Producto(Long idProducto, String distribuidora, String nomProducto, Long cantidad, Float precio) {
        this.idProducto = idProducto;
        this.distribuidora = distribuidora;
        this.nomProducto = nomProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    /*
    @Override
    public String toString (){
        return String.format("Producto(idProducto: %d, pedido: %s, distribuidora: %s, nomProducto: %s, cantida: %d, precio: %d",
                idProducto, pedido.getIdPedido(), distribuidora, nomProducto, cantidad, precio );
    }   
    */
    
    @Override
    public String toString (){
        return String.format("Producto(idProducto: %d, distribuidora: %s, nomProducto: %s, cantida: %d, precio: %d",
                idProducto, distribuidora, nomProducto, cantidad, precio );
    } 
    

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
}
