package com.jeffs.burgertracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffs.burgertracker.models.Burger;
import com.jeffs.burgertracker.respositories.BurgerRepository;

@Service
public class BurgerService {
	
	@Autowired
	private BurgerRepository burgerRepo;
	
	public List<Burger> allBurgers(){
		return burgerRepo.findAll();
	}
	
	public Burger createBurger(Burger b) {
		return burgerRepo.save(b);
	}
}
