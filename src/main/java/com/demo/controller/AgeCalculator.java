package com.demo.controller;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCalculator {


	@RequestMapping(value = "/getAge", method = RequestMethod.GET)
	
	public String getAge(@PathVariable("date") String date) {
		
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(1990, Month.AUGUST, 14);  //Birth date
		 
		Period p = Period.between(birthday, today);
		 
		//Now access the values as below
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		return String.valueOf(p.getYears());
	}
	
}
