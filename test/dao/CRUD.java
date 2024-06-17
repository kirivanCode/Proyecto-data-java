package dao;

import java.util.List;

public interface CRUD {
    public Object insertar(Object obj);
    public boolean actualizar(Object obj);
    public boolean eliminar(Object obj);
    public List<Object> listarTodo();
    public Object listarUno(Object obj);

}
