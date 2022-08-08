package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
	private final JokeService jokeService;

	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		String joke = jokeService.getJoke();
		model.addAttribute("joke", joke);
		return "index";
	}
}