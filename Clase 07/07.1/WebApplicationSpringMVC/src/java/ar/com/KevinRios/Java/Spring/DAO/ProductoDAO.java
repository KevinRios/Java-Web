package ar.com.KevinRios.Java.Spring.DAO;

import java.util.List;

import ar.com.KevinRios.Java.Spring.bo.Producto;

public interface ProductoDAO {
    
    public Long guardarProducto(Producto producto);
    public void actualizarProducto(Producto producto);
    public void borrarProducto(Long id);
    public Producto buscarProductoPorId(Long id);
    public List<Producto> recuperarProductos();
    

}
