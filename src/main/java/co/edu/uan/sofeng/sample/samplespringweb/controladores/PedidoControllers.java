
package co.edu.uan.sofeng.sample.samplespringweb.controladores;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import co.edu.uan.sofeng.sample.samplespringweb.dominio.Pedido;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.PedidoRepositorio;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yeisonfernando
 */
@Controller
@RequestMapping("/pedidos/")
public class PedidoControllers {
    
    private final PedidoRepositorio pedidoRepositorio;
    
    @Autowired
    public PedidoControllers(PedidoRepositorio pedidoRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }
    
    @GetMapping("/interact")
    public String showSignUpForm(Pedido pedido) {
        return "Pedidos";
    }   
    
    @PostMapping("add")
    public String addStudent(@Valid Pedido pedido, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Pedidos";
        }

        //clienteRepositorio.save(cliente);
        model.addAttribute("pedido", pedidoRepositorio.save(pedido));
        model.addAttribute("pedidos", pedidoRepositorio.findAll());
    
        System.out.println("pedidos guardado");
        return "Pedidos";
    }

    
}
