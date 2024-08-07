/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deeje
 */
public class ExamenesMedicos {
    private List<String> examenes;
    
    public ExamenesMedicos(){
        examenes = new ArrayList<String>();
    }
    
    
    public List<String> getExamenesMedicos() {
        return new ArrayList<>(examenes);
    }

    public void setExamenesMedicos(List<String> examenesMedicos) {
        this.examenes = examenesMedicos;
    }
    
    public void AgregarExamenmedico(String examen){
        examenes.add(examen);
    }

}
