package mx.com.sye.pruebas.ambiente.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Propiedades implements EnvironmentAware {

	@Autowired
	public static Environment environment;
	
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
