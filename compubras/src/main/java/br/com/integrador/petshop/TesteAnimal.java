package br.com.integrador.petshop;

import java.util.List;

import br.com.integrador.petshop.model.Animal;
import br.com.integrador.petshop.persistencia.AnimalDAO;



public class TesteAnimal {
	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		cliente.setIdCliente(2);
//		
//		Petshop petshop = new Petshop();
//		petshop.setIdPetshop(2);
//		
//		Animal animal = new Animal();		
//		animal.setNomeAnimal("Thor");
//		animal.setRacaAnimal("Shit Zu");
//		animal.setIdadeAnimal(6);
//		animal.setDescricaoAnimal("Macho afeminado.");
//		animal.setSexoAnimal("Masculino.");
//		
//		AnimalDAO aDAO = new AnimalDAO();
//		
//		animal.setCliente(cliente);
//		animal.setPetshop(petshop);
//		aDAO.cadastrar(animal);
		
//		Animal petshop = new Animal();
//		petshop.setIdAnimal(2);
//		
//		Cliente cliente = new Cliente();
//		cliente.setIdCliente(2);
//		
//		Petshop petshop = new Petshop();
//		petshop.setIdPetshop(2);
//		
//		Animal animal = new Animal();		
//		animal.setNomeAnimal("Thor");
//		animal.setRacaAnimal("Shit Zu");
//		animal.setIdadeAnimal(6);
//		animal.setDescricaoAnimal("Macho alpha.");
//		animal.setSexoAnimal("Masculino.");
//		animal.setIdAnimal(1);	
//		
//		AnimalDAO aDAO = new AnimalDAO();
//		
//		animal.setCliente(cliente);
//		animal.setPetshop(petshop);
//		aDAO.editar(animal);
		
//		AnimalDAO aDAO = new AnimalDAO();
//		aDAO.excluir(7);
		
//		AnimalDAO aDAO = new AnimalDAO();
//		Animal animal = aDAO.buscarPorId(1);
//		System.out.println("Animal buscado por ID: " + animal.getNomeAnimal());
		
	
		AnimalDAO aDAO = new AnimalDAO();
		List<Animal> listaAnimal = aDAO.buscarTodos();
		for(int i = 0; i < listaAnimal.size(); i++) {
			System.out.println("Lista de Animais: " + listaAnimal.get(i).getNomeAnimal());
		}
	}
}
