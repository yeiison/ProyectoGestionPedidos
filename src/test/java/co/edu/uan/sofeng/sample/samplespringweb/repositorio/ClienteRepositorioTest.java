package co.edu.uan.sofeng.sample.samplespringweb.repositorio;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.ClienteRepositorio;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.ClienteRepositorio;
import java.util.List;
import javax.transaction.Transactional;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author yeisonfernando
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional


public class ClienteRepositorioTest {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void crearCliente() {

        Cliente carlos = new Cliente("Carlos", "Sandoval");
        carlos.setIdentificacion(1073166695);
        carlos.setDirCliente("Cra 1a #26-32");
        carlos.setCiudadCliente("Madrid");
        //carlos.addPedido("21/10/2019", (float) 200); PREGUNTAR

        carlos = clienteRepositorio.save(carlos);
        assertThat(carlos.getIdCliente(), is(notNullValue()));
        assertThat(carlos.getIdentificacion(), is(1073166695));
        assertThat(carlos.getNomCliente(), is("Carlos"));
        assertThat(carlos.getApeCliente(), is("Sandoval"));
        assertThat(carlos.getDirCliente(), is("Cra 1a #26-32"));
        assertThat(carlos.getCiudadCliente(), is("Madrid"));
        //assertThat(carlos.addPedido(), is("21/10/2019", (float)20000)); PREGUNTAR
        System.out.println("******" + carlos);
    }
/*
    @Test
    public void readStudentByLastName() {

        Cliente carlos = new Cliente("Michelle", "Dessler");
        //carlos.addGrade((short) 3);
        //ClienteRepositorio.save(carlos);

        List<Cliente> clientes = clienteRepositorio.findBynomCliente("Dessler");
        assertThat(clientes, hasSize(1));
    }
*/
    
}
