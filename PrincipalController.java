package br.com.god_engine_performance.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.god_engine_performance.model.Carro;

public class PrincipalController {

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("god_engine_store");

	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String args[]) {
		
		/**
		 * CREATE
			Carro carro = new Carro();
			carro.setMarcaCarro("Ford");
			carro.setModeloCarro("Mustang GT RTR");
			carro.setAnoCarro(2021);
			carro.setMotorizacao("Coyote V8 5.0 Supercharged");
			carro.setDescricao("get description here");
			
			entityManager.getTransaction().begin();
			entityManager.persist(carro);
			entityManager.getTransaction().commit();
		*/
		
		/**
		 * READ
			Carro carro = entityManager.find(Carro.class, 1);
			System.out.println("Carro encontrado: " + carro.getModeloCarro());
		*/
		
		
		/**
		 * UPDATE
		 	Carro carro = new Carro();
			carro.setIdCarro(3);
			carro.setMarcaCarro("Ford");
			carro.setModeloCarro("Mustang GT RTR");
			carro.setAnoCarro(2021);
			carro.setMotorizacao("Coyote V8 5.0 Supercharged");
			carro.setDescricao("get description here");
					
			entityManager.getTransaction().begin();
			entityManager.merge(carro);
			entityManager.getTransaction().commit();
			
		 */
		
		/**
		 * DELETE
			Carro carro = entityManager.find(Carro.class, 2);
			entityManager.getTransaction().begin();
			entityManager.remove(carro);
			entityManager.getTransaction().commit();
		*/
		
		/**
		 * Ao final de toda transação, lembrar de fechar a comunicação com o banco de dados,
		 * encerrando os EntityManager e os EntityManagerFactory:
		 	entityManager.close();
			entityManagerFactory.close();
		 */
		
	}
}
