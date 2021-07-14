package restPuppers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import restPuppers.data.Pupper;
import restPuppers.services.PupperService;

@RestController // REST, tells Spring to make an instance of this class
public class PupperController {

	// dependency
	private PupperService service;

	// spring injecting it into my class
	public PupperController(PupperService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@PostMapping("/addPupper")
	public void addPupper(@RequestBody Pupper pup) {
		this.service.addPupper(pup);
	}

	@GetMapping("/getAllPuppers")
	public List<Pupper> getAllPuppers() {
		return this.service.getAllPuppers();
	}

	@GetMapping("/getPupper/{i}")
	public Pupper getPupper(@PathVariable int i) {
		return this.service.getPupper(i);
	}

	@PutMapping("/replacePupper/{i}")
	public String replacePupper(@PathVariable int i, @RequestBody Pupper pup) {
		return this.service.replacePupper(i, pup);
	}

	@DeleteMapping("/deletePupper/{i}")
	public String deletePupper(@PathVariable int i) {
		return this.service.deletePupper(i);
	}
}
