package restPuppers.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import restPuppers.data.Pupper;

@Service
public class PupperServiceList implements PupperService {

	private List<Pupper> pups = new ArrayList<>();

	@Override
	public String addPupper(Pupper pup) {
		addPupper(pup);
		System.out.println(pup); // print to print to server console
		return "Pupper added " + pup; // return to send stuff to the other end
	}

	@Override
	public List<Pupper> getAllPuppers() {
		return pups;
	}

	@Override
	public Pupper getPupper(int i) {
		Pupper located = this.pups.get(i);
		return located;
	}

	@Override
	public String replacePupper(int i, Pupper pup) {
		this.pups.set(i, pup);
		return "Updated Pupper " + pup;
	}

	@Override
	public String deletePupper(int i) {
		this.pups.remove(i);
		return "Deleted Pupper at index position " + i;
	}
}
