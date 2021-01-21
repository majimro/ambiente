package mx.com.sye.pruebas.ambiente.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.sye.pruebas.ambiente.util.Propiedades;

@RestController
public class MainController {

	private static final String template = "Valor, %s!";

	@GetMapping("/var")
	public String getVariable(@RequestParam(value = "variable", defaultValue = "JAVA_HOME") String name) {
		String valor = null;
		valor = Propiedades.getConfigProp(name);
		if (valor == null) {
			valor = "No existe la variable solicitada";
		}
		return new String(String.format(template, valor));
	}

	@GetMapping("/fecha")
	public String getFecha() {
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
		String stringDate= DateFor.format(date);
		return new String(String.format(template, stringDate));
	}

}
