/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author rafae
 */
public class VisualizarEvento {
  
    private String  Empresa, Data_evento, Horario_inicio, Horario_termino, Desc_evento;
  
    public  VisualizarEvento(String Empresa, String Data_evento, String Horario_inicio, String Horario_termino, String Desc_evento){
        
        this.Empresa = Empresa;
        this.Data_evento = Data_evento;
        this.Horario_inicio = Horario_inicio;
        this.Horario_termino = Horario_termino;
        this.Desc_evento = Desc_evento;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getData_evento() {
        return Data_evento;
    }

    public void setData_evento(String Data_evento) {
        this.Data_evento = Data_evento;
    }

    public String getHorario_inicio() {
        return Horario_inicio;
    }

    public void setHorario_inicio(String Horario_inicio) {
        this.Horario_inicio = Horario_inicio;
    }

    public String getHorario_termino() {
        return Horario_termino;
    }

    public void setHorario_termino(String Horario_termino) {
        this.Horario_termino = Horario_termino;
    }

    public String getDesc_evento() {
        return Desc_evento;
    }

    public void setDesc_evento(String Desc_evento) {
        this.Desc_evento = Desc_evento;
    }

    @Override
    public String toString() {
        return Empresa;
    }

    
    
    
}
    