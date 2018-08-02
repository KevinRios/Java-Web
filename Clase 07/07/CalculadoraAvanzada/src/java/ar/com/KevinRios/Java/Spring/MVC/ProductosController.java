package ar.com.KevinRios.Java.Spring.MVC;

import ar.com.KevinRios.Java.Spring.bo.Producto;
import java.util.*;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ar.com.KevinRios.Java.Spring.MVC.Form.ProductoForm;
import ar.com.KevinRios.Java.Spring.Service.ProductoService;

@Controller
@RequestMapping(value = "/productos")
public class ProductosController {

    @Autowired
    private ProductoService productoService;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {

        List<Producto> productos = productoService.buscarProductos();
        model.addAttribute("productos", productos);
        return null;
    }

    @RequestMapping(value = "/ver", method = RequestMethod.GET)
    public String ver(@RequestParam("id") long id, Model model) {
        Producto producto = productoService.buscarProducto(id);
        model.addAttribute("producto", producto);
        return null;
    }

    @RequestMapping(value = "/editar", method = RequestMethod.GET)
    public String editar(@RequestParam("id") long id, Model model) {
        Producto producto = productoService.buscarProducto(id);
        ProductoForm productoForm = new ProductoForm();
        BeanUtils.copyProperties(producto, productoForm);
        model.addAttribute("productoForm", productoForm);
        return "/productos/form";
    }

    @RequestMapping(value = "/borrar", method = RequestMethod.GET)
    public String borrar(@RequestParam("id") long id, Model model) {
        productoService.borrarProducto(id);
        return "redirect:/productos/listar.html";
    }

    @RequestMapping(value = "/nuevo", method = RequestMethod.GET)
    public String nuevo(Model model) throws Exception {

        ProductoForm productoForm = new ProductoForm();
        model.addAttribute("productoForm", productoForm);
        return "/productos/form";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(@ModelAttribute("productoForm") @Valid ProductoForm productoForm, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "/productos/form";
        }

        Long id = productoForm.getId();

        Producto producto = null;

        if (id == null) {
            producto = new Producto();
            BeanUtils.copyProperties(productoForm, producto);
            id = productoService.guardarProducto(producto);
        } else {
            producto = productoService.buscarProducto(id);
            BeanUtils.copyProperties(productoForm, producto);
            productoService.actualizarProducto(producto);
        }

        return "redirect:/productos/ver.html?id=" + id;
    }

}
