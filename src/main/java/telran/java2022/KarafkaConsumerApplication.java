package telran.java2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
	@KafkaListener(topics = "3q1zdl4k-default")
	public void printMessage(String str){
		System.out.println(str);
	}

}
