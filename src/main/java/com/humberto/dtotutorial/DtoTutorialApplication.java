package com.humberto.dtotutorial;

import com.humberto.dtotutorial.model.Location;
import com.humberto.dtotutorial.model.User;
import com.humberto.dtotutorial.repository.LocationRepository;
import com.humberto.dtotutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("San Fernando");
		location.setDescription("Hogar de Camaron de la Isla");
		location.setLongitude(-6.19);
		location.setLatitude(36.47);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Humberto");
		user1.setLastName("Casanova");
		user1.setEmail("humberto@iet.it");
		user1.setPassword("SecretPassword");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Domenico");
		user2.setLastName("Massimo");
		user2.setEmail("domenico@iet.it");
		user2.setPassword("SuperSecretPassword");
		user2.setLocation(location);
		userRepository.save(user2);

	}

}
