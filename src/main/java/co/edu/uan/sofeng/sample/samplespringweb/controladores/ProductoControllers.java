
package co.edu.uan.sofeng.sample.samplespringweb.controladores;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import co.edu.uan.sofeng.sample.samplespringweb.dominio.Pedido;
import co.edu.uan.sofeng.sample.samplespringweb.dominio.Producto;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.ProductoRepositorio;
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
@RequestMapping("/productos")
@Controller
public class ProductoControllers {
    private final ProductoRepositorio productoRepositorio;
    
    @Autowired
    public ProductoControllers(ProductoRepositorio productoRepositorio){
        this.productoRepositorio = productoRepositorio;
    }
    
    @GetMapping("/interact")
    public String showSingUpForm(Producto producto) {
        return "Gestion-Productos";
    }
    
    @PostMapping("add")
    public String addProducto(@Valid Producto producto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Gestion-Productos";
        }

        //clienteRepositorio.save(cliente);
        model.addAttribute("producto", productoRepositorio.save(producto));
        model.addAttribute("productos", productoRepositorio.findAll());
    
        System.out.println("producto guardado");
        return "Gestion-Productos";
    }  
    
}
