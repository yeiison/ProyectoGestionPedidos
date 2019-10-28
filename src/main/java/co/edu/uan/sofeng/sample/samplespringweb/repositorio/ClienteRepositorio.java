1
package co.edu.uan.sofeng.sample.samplespringweb.repositorio;

// @author yeisonfernando

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepositorio extends CrudRepository <Cliente, Long> {
    
    List<Cliente> findBynomCliente (String nomCliente); //agregar consultas especificas
    List<Cliente> findByciudadCliente (String ciudadCliente);

}

