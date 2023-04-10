package com.feuji.SpringMain.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.feuji.SpringMain.config.DBConfig;
import com.feuji.SpringMvcHybernate.Dao.VehicleDao;
import com.springMvcHybernate.entity.ModelYear;
import com.springMvcHybernate.entity.Vehicle;


@Controller
@Configuration
@ComponentScan(basePackages = { "com.feuji.SpringMain.config" })

public class VehicleController {
	
//	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DBConfig.class);
//
//	VehicleDao dao=applicationContext.getBean(VehicleDao.class);
	@Autowired
	private VehicleDao dao;
	
//	@Autowired
//	private ModelYear modelYear;
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView get()
	{
	
		return new ModelAndView("vehicleForm", "vehicle", new Vehicle());
	
	}
	
	@RequestMapping(value = "/redirect")
	public String save(@Valid Vehicle vehicle, BindingResult bindingResult,ModelMap modelMap)
	{
		if (bindingResult.hasErrors()) {
	           return "vehicleForm";
	      }
		ModelYear modelYear= new ModelYear();
		modelYear.setBrandValue("Audi");
		modelYear.setYears(100);
		vehicle.setModelYear(modelYear);
		dao.save(vehicle);
		//new AnnotationConfigApplicationContext(DBConfig.class).getBean(VehicleDao.class).save(vehicle);
		//modelMap.put("vehicle", vehicle);
		return "redirect" ;
		
	}
//	
//	@RequestMapping(value = "/submitVehicle", method = RequestMethod.GET)
//	public ModelAndView getAllVehicles() {
//		 List<Vehicle> vehicle=dao.getter();
//	  //  List<Vehicle> vehicle = new AnnotationConfigApplicationContext(DBConfig.class).getBean(VehicleDao.class).getter();
//	    return new ModelAndView("submitVehicle", "vehicle", vehicle);
//	}
//	
//	@RequestMapping("/deletion")
//	public ModelAndView deleting(@RequestParam long vehicleNO)
//	{
//	//	new AnnotationConfigApplicationContext(DBConfig.class).getBean(VehicleDao.class).deleted(vehicleNO);
//	//	 List<Vehicle> vehicle = new AnnotationConfigApplicationContext(DBConfig.class).getBean(VehicleDao.class).getter();
//		
//		dao.deleted(vehicleNO);
//		 List<Vehicle> vehicle=dao.getter();
//		    return new ModelAndView("submitVehicle", "vehicle", vehicle);
//	}
//	
//	@RequestMapping("/update")
//	public ModelAndView update( @RequestParam long vehicleNO)
//	{
//			Vehicle v=dao.edit(vehicleNO);
//		 ModelAndView andView=new  ModelAndView("update");
//		 andView.addObject("vehicle",v);
//		 return andView;
//	}
//	
//	@RequestMapping(value="/updated", method = RequestMethod.POST)
//	public ModelAndView updated(Vehicle vehicle)
//	{
//		
//	//	new AnnotationConfigApplicationContext(DBConfig.class).getBean(VehicleDao.class).update(vehicle);
//	//	 List<Vehicle> vehicleList = new AnnotationConfigApplicationContext(DBConfig.class).getBean(VehicleDao.class).getter();
//		dao.update(vehicle);
//		 List<Vehicle> vehicleList=dao.getter();
//		    return new ModelAndView("submitVehicle", "vehicle", vehicleList);
//	}
}
