package com.ssi.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entity.Covid;

@Repository
public class CovidRepoImpl implements CovidRepo {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Covid getDataById(int id) {
		Session session=sessionFactory.openSession();
		Covid covid=session.get(Covid.class,id);
		session.close();
		return covid;
	}

	public List<Covid> getDataForAState(String state) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Covid.class);
		Criterion crt=Restrictions.eq("state", state);
		cr.add(crt);
		List<Covid> covidList=cr.list(); 				 							
		session.close();
		return covidList;
	}

	public List<Covid> getDataForAllStates() {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Covid.class);
		List<Covid> covidList=cr.list(); 				 							
		session.close();
		return covidList;
	}

	public Covid addInfo(Covid covid) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(covid);
		transaction.commit(); 				 							
		session.close();
		return covid;
	}

	public Covid updateInfo(Covid covid) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(covid);
		transaction.commit(); 				 							
		session.close();
		return covid;
	}

	public Covid deleteInfo(int id) {
		Session session=sessionFactory.openSession();
		Covid covid=session.get(Covid.class, id);
		Transaction transaction=session.beginTransaction();
		session.delete(covid);
		transaction.commit(); 				 							
		session.close();
		return covid;
	}

}
