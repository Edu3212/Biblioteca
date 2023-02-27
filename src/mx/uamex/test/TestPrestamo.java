/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author Angela Rios
 */
public class TestPrestamo {

    public static void main(String[] args) {

        Libro libros1 = new Libro();
        libros1 . setId(1);
        libros1.setNombre("Fundamentos de programacion");
        libros1.setCategoria("Programación");
        libros1.setEditorial("Alfaomega");
        libros1.setIsbn(2324);
        libros1.setStock(5);

      
        List<Libro> listaLibros2 = new ArrayList<>();
        
        List<Libro> listaLibros3 = new ArrayList<>();
         
        List<Libro> listaLibros = new ArrayList<>();
         listaLibros.add(libros1);
      
        
        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidoPaterno("Hernadez");
        alumno1.setApellidoMaterno("Ruiz");
        alumno1.setNumeroCuenta(20227102);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
         
        Libro libro2 = new Libro();
        libro2.setId(1);
        libro2.setNombre("Los de abajo");
        libro2.setCategoria("Historia");
        libro2.setEditorial("Letras mexicanas");
        libro2.setIsbn(3454);
        libro2.setStock(8);
        
        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setNombre("Samuel");
        alumno2.setApellidoPaterno("Flores");
        alumno2.setApellidoMaterno("Nieto");
        alumno2.setNumeroCuenta(20227130);
       
        listaLibros2.add(libro2);
        
        Prestamo prestamo2 = new Prestamo();
        Date fechaIni2 = new Date();
        prestamo2.setId(2);
        prestamo2.setFolio(2228);
        prestamo2.setFechainicio(fechaIni2);
        prestamo2.setLibros(listaLibros2);
        prestamo2.setPersona(alumno2);
      
        Libro libro3 = new Libro();
        libro3.setId(3);
        libro3.setNombre("La filosofia va al cine");
        libro3.setCategoria("Filosofia");
        libro3.setEditorial("Tecnos");
        libro3.setIsbn(3554);
        libro3.setStock(5);
        
        listaLibros3.add(libro3);
                
        Alumno alumno3 = new Alumno();
        alumno3.setId(3);
        alumno3.setNombre("Eduardo");
        alumno3.setApellidoPaterno("Monsalvo");
        alumno3.setApellidoMaterno("Flores");
        alumno3.setNumeroCuenta(20227155);
        
        Prestamo prestamo3 = new Prestamo();
        Date fechaIni3 = new Date();
        prestamo3.setId(3);
        prestamo3.setFolio(2229);
        prestamo3.setFechainicio(fechaIni3);
        prestamo3.setLibros(listaLibros3);
        prestamo3.setPersona(alumno3);
        
        System.out.println(prestamo1);
       System.out.println(prestamo2);
       System.out.println(prestamo3);
    }
}
