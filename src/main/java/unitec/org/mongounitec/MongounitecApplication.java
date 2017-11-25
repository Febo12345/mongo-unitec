package unitec.org.mongounitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongounitecApplication implements CommandLineRunner{
    
@Autowired RepositorioMensajito repoMensa;

	public static void main(String[] args) {
		SpringApplication.run(MongounitecApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
     Mensajito mensa2=new Mensajito("segundo", "Mi segundo mensajito");
     
     repoMensa.save(mensa2);
        System.out.println("Mensaje guardado");
    }
}
