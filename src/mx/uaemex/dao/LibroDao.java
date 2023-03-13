/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Libro;

/**
 *
 * @author DEMF
 */
public class LibroDao {
    
     public  List<Libro> libros = new ArrayList<>();

     
    public void Agregar(Libro libro) {
        libros.add(libro);

    }

    public void Eliminar(Libro libro) {
        libros.remove(libro);
    }

    public Libro Buscar(int id) {
        for (int i = 0; i < libros.size(); i++) {
            Libro a= libros.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  Actualizar(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
          if(libros.get(i).getId()== libro.getId()){
              libros.get(i).setNombre(libro.getNombre());
          }
            }
        }
     
    
    public void Imprimir (ArrayList<Libro> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
    
    
    
    
}
