package com.sm.demo.sm.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.demo.service.SMService;
import com.sm.demo.sm.entity.SM;

@RestController
@RequestMapping("SM")
public class SMController {
	
	@Autowired
	SMService service;

	@PostMapping("/SMs")
	public List<SM> getSMs(@RequestBody SM sm){
		return service.getSMs(sm);
	}
	
	@PostMapping("/SMInsert")
	public SM inSertSM(@RequestBody SM sm){
		return service.insertSM(sm);
	}
	
	@PostMapping("/SMDelete")
	public void deleteSM(@RequestBody SM sm){
		service.deleteSM(sm);
	}
	
	@PostMapping("/searchSMId")
	public SM searchSMId(@RequestBody Long id){
		return service.findByid(id).get();
	}
}
