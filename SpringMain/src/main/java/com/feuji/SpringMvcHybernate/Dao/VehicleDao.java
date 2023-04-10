package com.feuji.SpringMvcHybernate.Dao;

import org.hibernate.Session;

import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springMvcHybernate.entity.Vehicle;

import java.util.List;

import org.hibernate.*;

@Repository
@Transactional
public class VehicleDao {

	@Autowired
	private SessionFactory sessionFactory;


	public void save(Vehicle vehicle)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(vehicle);
	}
//	public List<Vehicle> getter()
//	{
//		Session session=sessionFactory.getCurrentSession();
//		NativeQuery<Vehicle> nativeQuery= session.createNativeQuery("select * from vehicles", Vehicle.class);
//		return nativeQuery.getResultList();
//		
//	}
//	public Vehicle edit(long vehicleNO)
//	{
//		Session session=sessionFactory.getCurrentSession();
//		Vehicle vehicle2=session.get(Vehicle.class, vehicleNO);
//		return vehicle2;
//	}
//	public void update(Vehicle vehicle)
//	{
//		Session session=sessionFactory.getCurrentSession();
//		session.update(vehicle);
//	}
//	
//	
//
//	
//	public void deleted(long vehicleNO)
//	{
//		Session session=sessionFactory.getCurrentSession();
//		Vehicle vehicle=session.get(Vehicle.class, vehicleNO);
//		session.delete(vehicle);
//	}
}
