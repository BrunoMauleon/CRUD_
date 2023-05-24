package mx.edu.unpa.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.unpa.crud.entity.Aspirantes;
import mx.edu.unpa.crud.repository.AspirantesRepository;

@Service
public class AspirantesServiceImpl implements AspirantesService{
	
	

	@Autowired
	private AspirantesRepository aspirantesRepository;

	@Override
	public List<Aspirantes> listarTodosLosEstudiantes() {
		return aspirantesRepository.findAll();
	}

	@Override
	public Aspirantes guardarEstudiante(Aspirantes aspirantes) {
		return aspirantesRepository.save(aspirantes);
	}

	@Override
	public Aspirantes obtenerEstudiantePorId(Long id) {
		return aspirantesRepository.findById(id).get();
	}

	@Override
	public Aspirantes actualizarEstudiante(Aspirantes aspirantes) {
		return aspirantesRepository.save(aspirantes);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		aspirantesRepository.deleteById(id);

	}
	


	

}
