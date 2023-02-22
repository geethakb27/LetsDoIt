package com.xworkz.valentine.Repository;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl  implements ValentineRepository
{

	@Autowired
	private EntityManagerFactory entityManagerFactory;


	public ValentineRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineEntity entity) {

		System.out.println("Running save");

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public ValentineEntity findById(int id) {
		System.out.println("running find by id" +id);	
		EntityManager entityManager =this.entityManagerFactory.createEntityManager();
		ValentineEntity entity=entityManager.find(ValentineEntity.class, id);
		entityManager.close();
		return entity;
		
		
	
	}	

}
