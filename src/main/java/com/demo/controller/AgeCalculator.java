package com.demo.controller;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AgeCalculator {

	@RequestMapping(value = "/getAge", method = RequestMethod.GET)		
	public String getAge(@RequestParam(name="date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) 
	{
		
		LocalDate today = LocalDate.now();                          
		LocalDate birthday = LocalDate.of(date.getYear(),date.getMonth(), date.getDayOfMonth());  
		
		Period p = Period.between(birthday, today);		 
		//Now access the values as below
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		return String.valueOf(p.getYears() + " Years" + " " + p.getMonths() + " Months" +" " +p.getDays() +" " + " Days");
	}
}
