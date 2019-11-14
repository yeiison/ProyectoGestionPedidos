
package co.edu.uan.sofeng.sample.samplespringweb.controladores;

import javax.validation.Valid;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.ClienteRepositorio;

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
@RequestMapping("/clientes/")
public class ClienteControllers {
    
    private final ClienteRepositorio clienteRepositorio;
    
    @Autowired
    public ClienteControllers(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }   
   
    @GetMapping("/interact")
    public String showSignUpForm(Cliente cliente) {
        return "Gestion-Clientes";
    }    
    
    
    @GetMapping("lista")
    public String showUpdateForm(Model model){
        model.addAttribute("clientes", clienteRepositorio.findAll());
        return "HomePage";
    }
    
        @PostMapping("add")
    public String addStudent(@Valid Cliente cliente, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Gestion-Clientes";
        }

        //clienteRepositorio.save(cliente);
        model.addAttribute("cliente", clienteRepositorio.save(cliente));
        model.addAttribute("clientes", clienteRepositorio.findAll());
    
        System.out.println("cliente guardado");
        return "Gestion-Clientes";
    }

}
