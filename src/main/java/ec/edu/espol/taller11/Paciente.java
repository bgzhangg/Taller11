package ec.edu.espol.taller11;

public class Paciente extends Persona {
    private static int EdadAdultoMayor = 65;
    private HistorialMedico historialMedico;
    
    public Paciente(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
    }

    public boolean esAdultoMayor(){
        return super.getEdad()>= EdadAdultoMayor;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
    
    public void agregarConsultaHistorial (Consulta consulta){
        historialMedico.agregarConsultas(consulta);
    }
    
    public void agregarRecetaHistorial (RecetaMedica receta){
        historialMedico.agregarReceta(receta);
    }
}