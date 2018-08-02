package edu.curso.java.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.curso.java.spring.bo.Producto;
import edu.curso.java.spring.dao.ProductoDAO;

@Service
@Transactional
public class ProductoService {

    private static Log log = LogFactory.getLog(ProductoService.class);

    @Autowired
    private ProductoDAO productoDAO;

    public Long guardarProducto(Producto producto) {
        return productoDAO.guardarProducto(producto);
    }

    public Producto buscarProducto(Long id) {
        return productoDAO.buscarProductoPorId(id);
    }

    public List<Producto> buscarProductos() {
        return productoDAO.recuperarProductos();
    }

    public void borrarProducto(long id) {
        productoDAO.borrarProducto(id);
    }

    public void actualizarProducto(Producto producto) {
        productoDAO.actualizarProducto(producto);
    }

}
