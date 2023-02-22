package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;


@Repository
public class AeroplaneRepositoryImpl implements AeroplaneRepository{

	 @Autowired
	 private EntityManagerFactory entityManagerFactory;

	 
	 public AeroplaneRepositoryImpl() {
			System.out.println("Created " + this.getClass().getSimpleName());
	}
	 @Override
		public boolean save(AeroplaneEntity entity) {
			System.out.println("Running save in Repository");
			EntityManager em = this.entityManagerFactory.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			em.close();
			return true;
	}

		@Override
		public AeroplaneEntity findById(int id) {
			System.out.println("find by id in repo " + id);
			EntityManager entityManager = this.entityManagerFactory.createEntityManager();
			AeroplaneEntity fromDb = entityManager.find(AeroplaneEntity.class, id);
			entityManager.close();
			return fromDb;
		}
}
