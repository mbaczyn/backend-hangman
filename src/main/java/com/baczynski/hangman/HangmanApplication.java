package com.baczynski.hangman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HangmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangmanApplication.class, args);
	}

	@GetMapping("/word")
	public Word WordController(@RequestParam(value = "lang", defaultValue = "pl") String lang) {

		Word returnWord = new Word();
		if(lang.equals("pl")) returnWord = new Word(1, "NIESPODZIANECZKA", "pl", 1);
		if(lang.equals("en")) returnWord = new Word(2, "SURPRISE", "pl", 1);
		if(lang.equals("de")) returnWord = new Word(3, "UBERRASCHUNG", "pl", 1);

		return returnWord;
	}

}
