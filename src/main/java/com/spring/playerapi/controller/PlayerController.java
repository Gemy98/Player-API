package com.spring.playerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.playerapi.exception.StudentException;
import com.spring.playerapi.model.Player;
import com.spring.playerapi.service.PlayerService;




//localhost8080:spring-crm-rest
@RestController
@RequestMapping("/api")
//localhost:8080/spring-crm-rest/api/
public class PlayerController {
	
	@Autowired
	private PlayerService playerService ; 
	
	
	//localhost:8080/spring-crm-rest/api/data
	@GetMapping("/data")
	public String getData()	{
		
		return"mydata";
	}
	
	
	//localhost:8080/spring-crm-rest/api/players
		@GetMapping("/player")
		public Player player(@RequestParam int id){
			Player p = playerService.showPlayer(id);
			if (p == null) {
				throw new StudentException("player not found id :"+id);
			}
			
			
			return p;
		}
	
	
	//localhost:8080/spring-crm-rest/api/players
	@GetMapping("/players")
	public List<Player> players(){
		
		return playerService.allPlayers()	;
	}

}
