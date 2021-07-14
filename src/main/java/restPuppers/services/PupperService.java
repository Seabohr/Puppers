package restPuppers.services;

import java.util.List;

import restPuppers.data.Pupper;

public interface PupperService {

	public String addPupper(Pupper pup);

	public List<Pupper> getAllPuppers();

	public Pupper getPupper(int i);

	public String replacePupper(int i, Pupper pup);

	public String deletePupper(int i);
}
