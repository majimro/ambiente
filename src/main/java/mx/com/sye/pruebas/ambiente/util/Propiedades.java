package mx.com.sye.pruebas.ambiente.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Clase para obtener los valores de las variables de ambiente
 * @author Mauricio Jiménez
 * @version 1.0
 * @since Agosto, 2022
 */
@Component
public class Propiedades implements EnvironmentAware {

	@Autowired
	public static Environment environment;
	
    /**
     * Método para obtener la variable de entorno
     * @param key - nombre de la variable
     * @return Valor de la variable de entorno
     */
    public static  String getConfigProp(String key) {
        return environment.getProperty(key);
    }

    @Override
    public void setEnvironment(Environment arg0) {
        if(environment==null){
        	System.out.println("ENV === NULL");
            environment=arg0;
        }

    }

}
