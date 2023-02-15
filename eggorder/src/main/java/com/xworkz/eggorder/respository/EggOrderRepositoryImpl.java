package com.xworkz.eggorder.respository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.eggorder.dto.EggOrderDTO;

@Repository
public class EggOrderRepositoryImpl implements EggOrderRepository {

	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public EggOrderRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}


	@Override
	public boolean save(EggOrderDTO dto) {
		System.out.println("Running save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;

	}
}





