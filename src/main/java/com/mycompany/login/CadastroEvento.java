/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author rafae
 */
public class CadastroEvento {
 
    private String  empresa, data_evento, horario_inicio, horario_termino, desc_evento;
    
    public void CadastrarEvento(String empresa, String data_evento, String horario_inicio, String horario_termino, String desc_evento){
        
        this.empresa = empresa;
        this.data_evento = data_evento;
        this.horario_inicio = horario_inicio;
        this.horario_termino = horario_termino;
        this.desc_evento = desc_evento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getData_evento() {
        return data_evento;
    }

    public void setData_evento(String data_evento) {
        this.data_evento = data_evento;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_termino() {
        return horario_termino;
    }

    public void setHorario_termino(String horario_termino) {
        this.horario_termino = horario_termino;
    }

    public String getDesc_evento() {
        return desc_evento;
    }

    public void setDesc_evento(String desc_evento) {
        this.desc_evento = desc_evento;
    }

            
}
