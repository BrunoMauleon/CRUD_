package mx.edu.unpa.crud.service;


import java.util.List;

import mx.edu.unpa.crud.entity.Aspirantes;

public interface AspirantesService {
	
	
	public List<Aspirantes> listarTodosLosEstudiantes();
	
	public Aspirantes guardarEstudiante(Aspirantes aspirantes);
	
	public Aspirantes obtenerEstudiantePorId(Long id);
	
	public Aspirantes actualizarEstudiante(Aspirantes aspirantes);
	
	public void eliminarEstudiante(Long id);
}
