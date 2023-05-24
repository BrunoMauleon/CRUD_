package mx.edu.unpa.crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import mx.edu.unpa.crud.entity.Aspirantes;
import mx.edu.unpa.crud.service.AspirantesService;



@Controller
public class AspirantesController {
	
	@Autowired
	private AspirantesService servicio;

	@GetMapping({ "/aspirantes", "/" })
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("aspirantes", servicio.listarTodosLosEstudiantes());
		return "view/app.html"; // nos retorna al archivo estudiantes
	}

	@GetMapping("/aspirantes/nuevo")
	public String mostrarFormularioDeRegistrtarEstudiante(Model modelo) {
		Aspirantes aspirante = new Aspirantes();
		modelo.addAttribute("aspirantes", aspirante);
		return "view/add.html";
	}

	@PostMapping("/aspirantes")
	public String guardarEstudiante(@ModelAttribute("aspirantes") Aspirantes aspirante) {
		servicio.guardarEstudiante(aspirante);
		return "redirect:/";
	}

	@GetMapping("/aspirantes/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("aspirantes", servicio.obtenerEstudiantePorId(id));
		return "view/editar.html";
	}
	@PostMapping("/aspirantes/{id}")
	public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("aspirantes") Aspirantes aspirante,
			Model modelo) {
		Aspirantes a = servicio.obtenerEstudiantePorId(id);
		a.setId(id);
		a.setCURP(aspirante.getCURP());
		a.setNombre(aspirante.getNombre());
		a.setApellidoP(aspirante.getApellidoP());
		a.setApellidoM(aspirante.getApellidoM());
		a.setCorreo(aspirante.getCorreo());
		a.setTelefono(aspirante.getTelefono());
		a.setFecha_nacimiento(aspirante.getFecha_nacimiento());
		a.setNss(aspirante.getNss());
		a.setNacionalidad(aspirante.getNacionalidad());
		a.setEstado(aspirante.getEstado());
		a.setMunicipio(aspirante.getMunicipio());
		a.setCodigo_postal(aspirante.getCodigo_postal());
		a.setEscuela_procedencia(aspirante.getEscuela_procedencia());
		a.setEspecialidad_cursada(aspirante.getEspecialidad_cursada());
		a.setCarrera1(aspirante.getCarrera1());
		a.setCarrera2(aspirante.getCarrera2());

		servicio.actualizarEstudiante(a);
		return "redirect:/";
	}

	@GetMapping("/aspirantes/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		servicio.eliminarEstudiante(id);
		return "redirect:/";
	}
}

