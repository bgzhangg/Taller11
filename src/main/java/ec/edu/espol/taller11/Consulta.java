package ec.edu.espol.taller11;

import ec.edu.espol.taller11.Utilitarios.Fecha;
import java.util.List;

public class Consulta {
    private Fecha fecha;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private String diagnostico;
    private String tratamiento;
    private ExamenesMedicos examenesMedicos;

    public Consulta(Fecha fecha, String hora, Paciente paciente, Medico medico, 
            ServicioMedico servicioMedico) {
        this.fecha = fecha;
        this.hora = hora;
        this.servicioMedico = servicioMedico;
        this.paciente = paciente;
        this.medico = medico;
        this.realizada = false;
        this.examenesMedicos = new ExamenesMedicos();
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    
    //Examenes Medicos
    
    public ExamenesMedicos getExamenesMedicos() {
        return examenesMedicos;
    }

    public void setExamenesMedicos(ExamenesMedicos examenesMedicos) {
        this.examenesMedicos = examenesMedicos;
    }

    public ServicioMedico getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(ServicioMedico servicioMedico) {
        this.servicioMedico = servicioMedico;
    }
}
