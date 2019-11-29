
package co.edu.uan.sofeng.sample.samplespringweb.repositorio;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Producto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author yeisonfernando
 */
public interface ProductoRepositorio extends CrudRepository <Producto, Long>{
    List<Producto> findBydistribuidora (String distribuidora);
    List<Producto> findBynomProducto (String nomProducto);
    
    
}
