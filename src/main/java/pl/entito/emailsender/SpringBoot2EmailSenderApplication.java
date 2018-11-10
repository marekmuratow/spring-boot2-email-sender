package pl.entito.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2EmailSenderApplication implements CommandLineRunner {

	@Autowired
	private EmailSenderService sender;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2EmailSenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String mailTo = "recipient@gmail.com";
		String subject = "Email subject";
		String msg = "Email body";

		sender.sendSimpleMessage(mailTo, subject, msg);
	}
}
