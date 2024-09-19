package cicd.azure;

import org.springframework.boot.SpringApplication;

public class TestCicdAzureApplication {

	public static void main(String[] args) {
		SpringApplication.from(CicdAzureApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
