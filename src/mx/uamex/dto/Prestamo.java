/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uamex.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Angela Rios
 */
public class Prestamo {

    private int id;
    private int folio;
    private Date fechainicio;
    private Date fechaentrega;
    private String estatus;
    private List<Libro> libros1;
    private List<Libro> libros2;
    private List<Libro> libros3;
    private Persona persona;

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<Libro> getLibros() {
        return libros1;
    }

    public void setLibros(List<Libro> libros) {
        this.libros1 = libros;
    }
    public List<Libro> getLibros2() {
        return libros2;
    }

    public void setLibros2(List<Libro> libros2) {
        this.libros2 = libros2;
    }

    public List<Libro> getLibros3() {
        return libros3;
    }

    public void setLibros3(List<Libro> libros3) {
        this.libros3 = libros3;
    }
   
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", folio=" + folio + ", fechainicio=" + fechainicio + ", fechaentrega=" + fechaentrega + ", estatus=" + estatus + ", libros=" + libros1  + ", persona=" + persona + '}';
    }
 
    
     
}
