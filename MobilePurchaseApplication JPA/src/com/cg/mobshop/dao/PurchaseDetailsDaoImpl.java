package com.cg.mobshop.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.mobshop.dto.Mobile;
import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;

public class PurchaseDetailsDaoImpl  implements PurchaseDAO{
	
	EntityManager manager;

	public PurchaseDetailsDaoImpl() throws PurchaseException{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		manager=emf.createEntityManager();
	
	}
	@Override
	public int addPurchaseDetails(PurchaseDetails pr) throws PurchaseException {
		manager.getTransaction().begin();
		manager.persist(pr);
		manager.getTransaction().commit();
		return pr.getPurchaseId();

	}
	@Override
	public ArrayList<Mobile> getMobileList() {
	     ArrayList<Mobile> list=new ArrayList<>();
	     
	     TypedQuery<Mobile> qry=manager.createQuery("select p from Mobile p ",Mobile.class);//mobile in query refers to class name
	     list=(ArrayList<Mobile>) qry.getResultList();
		return list;
	}
	@Override
	public List<Mobile> getMobileList(int min, int max) {
		// TODO Auto-generated method stub
		 TypedQuery<Mobile> qry=manager.createQuery("select p from Mobile p"
				 +" where p.price between :lower and :upper",Mobile.class);
		 
		 qry.setParameter("lower", min);
		 qry.setParameter("upper", max);
	List<Mobile> list= qry.getResultList();
				 
				 
				 return list;
		
		
		
	}
	@Override
	public Mobile updateMobileDetails(Mobile mob) {
		
		manager.getTransaction().begin();
		Mobile mobile=manager.find(Mobile.class,mob.getMobileId());
		mobile.setPrice(mob.getPrice());
		mobile.setQuantity(mob.getQuantity());
		manager.merge(mobile);
		manager.getTransaction().commit();
		return mob;
		
		
		
		
	

}
}










