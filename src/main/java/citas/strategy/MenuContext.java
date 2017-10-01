package citas.strategy;

import java.util.ArrayList;

import java.util.List;

public class MenuContext {
	static final String CALDEROS_LIMPIOS = "Calderos limpios" ;
	static final String FUEGO_ENCENDIDO = "Fuego encendido";
	static final String EXTRACTOR_ACTIVADO = "Extractor activado";

	private List<String> menu;

	public MenuContext() {
		menu = new ArrayList<>();
	}
	public List<String> getMenu(){
		return this.menu;
	}

	public String fregarCalderos() {
		return CALDEROS_LIMPIOS;
	}

	public String encenderFuego() {
		return FUEGO_ENCENDIDO;
	}
	
	public String activarExtractor(){
		return EXTRACTOR_ACTIVADO;
	}
	public List<String> anadirPlato(EstrategiaDeReceta estrategiaDeReceta){
		menu.add(estrategiaDeReceta.cocinar());
		return menu;
	}

}
