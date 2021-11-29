package Logico;

import java.util.ArrayList;

public class Clinica {
	
	private ArrayList <Paciente> misPacientes;
	private ArrayList <Usuario> misUsuarios;
	private ArrayList <CitaMedica> citasMedicas;
	private ArrayList <Enfermedad> misEnfermedades;
	private ArrayList <Vacuna> misVacunas;
	
	public Clinica(ArrayList<Paciente> misPacientes, ArrayList<Usuario> misUsuarios, ArrayList<CitaMedica> citasMedicas,
			ArrayList<Enfermedad> misEnfermedades, ArrayList<Vacuna> misVacunas) {
		super();
		this.misPacientes = misPacientes;
		this.misUsuarios = misUsuarios;
		this.citasMedicas = citasMedicas;
		this.misEnfermedades = misEnfermedades;
		this.misVacunas = misVacunas;
	}

	public ArrayList<Paciente> getMisPacientes() {
		return misPacientes;
	}

	public void setMisPacientes(ArrayList<Paciente> misPacientes) {
		this.misPacientes = misPacientes;
	}

	public ArrayList<Usuario> getMisUsuarios() {
		return misUsuarios;
	}

	public void setMisUsuarios(ArrayList<Usuario> misUsuarios) {
		this.misUsuarios = misUsuarios;
	}

	public ArrayList<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(ArrayList<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}

	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}
	
	public void RegPaciente(Paciente paciente) {
		misPacientes.add(paciente);
	}

	//Control de enfermedades bajo vigilancia
		private Enfermedad buscarEnfermedad(String codigoEnfermedad) {
			Enfermedad enfermedad = null;
			boolean encontrado = false;
			int i = 0;
			while (!encontrado && i <misEnfermedades.size()) {
				if(misEnfermedades.get(i).getCodigoEnfermedad().equalsIgnoreCase(codigoEnfermedad))
				{
					enfermedad = misEnfermedades.get(i);
					encontrado = true;
				}
				i++;
			}
			return enfermedad;
			} 
		
		
		//Control de vacunas
		
		private Vacuna buscarVacuna(String codigoVacuna) {
			Vacuna vacuna = null;
			boolean encontrado = false;
			int i = 0;
			while (!encontrado && i <misVacunas.size()) {
				if(misVacunas.get(i).getCodigoVacunacion().equalsIgnoreCase(codigoVacuna))
				{
					vacuna = misVacunas.get(i);
					encontrado = true;
				}
				i++;
			}
			return vacuna;
			} 
		
		private int conteoVacuna(String codigoVacuna) {
			
			int vacunaCont = 0;
			
			for (Vacuna vacuna : misVacunas) {
				if(vacuna.getCodigoVacunacion().equalsIgnoreCase(codigoVacuna)) {
					vacunaCont++;
				}
			}
			return vacunaCont;
		}
	
}
