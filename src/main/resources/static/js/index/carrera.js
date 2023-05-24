const opcion1 = document.getElementById("carrera1");
const opcion2 = document.getElementById("carrera2");

// Escuchar el evento "change" en la primera selección
opcion1.addEventListener("change", () => {
  // Obtener el valor seleccionado en la primera selección
  const valorSeleccionado = carrera1.value;

  // Deshabilitar las opciones en la segunda selección que tengan el mismo valor
  carrera2.querySelectorAll("option").forEach((opcion) => {
    if (opcion.value === valorSeleccionado) {
      opcion.disabled = true;
    } else {
      opcion.disabled = false;
    }
  });
});
