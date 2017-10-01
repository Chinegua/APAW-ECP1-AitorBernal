package citas.strategy;

import java.util.ArrayList;

import java.util.List;

public class MenuContext {
	private List<String> menu;

	public MenuContext() {
		menu = new ArrayList<String>();
	}
	public List<String> getMenu(){
		return this.menu;
	}

	public String fregarCalderos() {
		return "Calderos limpios";
	}

	public String encenderFuego() {
		return "Fuego encendido";
	}
	
	public String activarExtractor(){
		return "Extractor activado";
	}
	public List<String> añadirPlato(EstrategiaDeReceta estrategiaDeReceta){
		menu.add(estrategiaDeReceta.cocinar());
		return menu;
	}

}
