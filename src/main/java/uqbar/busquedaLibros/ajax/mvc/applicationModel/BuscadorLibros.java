package uqbar.busquedaLibros.ajax.mvc.applicationModel;

import java.util.List;

import uqbar.busquedaLibros.ajax.mvc.domain.Biblioteca;
import uqbar.busquedaLibros.ajax.mvc.domain.Libro;

public class BuscadorLibros {
	private String textoBusqueda = "";
	private List<Libro> resultados = null;
	private Integer posicionLibroActual = null;

	public void buscar(String textoBusqueda) {
		this.textoBusqueda = textoBusqueda;
		this.resultados = Biblioteca.getInstance().buscar(this.textoBusqueda);
		this.posicionLibroActual = null;
	}

	public void elegirLibro(int posicion) {
		this.posicionLibroActual = posicion;
	}

	// ********************************************************
	// ** Habilitar o deshabilitar botones
	// ********************************************************

	public boolean isPuedeAnterior() {
		return this.posicionLibroActual > 0;
	}

	public boolean isPuedeSiguiente() {
		return this.posicionLibroActual + 1 < this.resultados.size();
	}

	// ********************************************************
	// ** Accessors
	// ********************************************************

	public String getTextoBusqueda() {
		return this.textoBusqueda;
	}

	public List<Libro> getResultados() {
		return this.resultados;
	}

	public Libro getLibroActual() {
		return this.resultados.get(this.posicionLibroActual);
	}

	public Integer getPosicionLibroActual() {
		return this.posicionLibroActual;
	}
}
