
package co.edu.uan.sofeng.sample.samplespringweb.repositorio;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Pedido;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author yeisonfernando
 */
public interface PedidoRepositorio extends CrudRepository <Pedido, Long> {
    List<Pedido> findByfecha (String fecha);
    
}
