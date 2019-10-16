package com.sm.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.demo.sm.entity.SM;
import com.sm.demo.sm.repository.SMRepository;

@Service
public class SMService {

	@Autowired
	SMRepository smRepository;

	
	public List<SM> getSMs(SM sm) {
		return smRepository.findByAllCondition(sm.getId(), sm.getName(),
				sm.getEchelon(),  sm.getEduLevel(), sm.getCountry());
	}
	
	public Optional<SM> findByid(Long id){
		return smRepository.findById(id);
	}


	@Transactional
	public SM insertSM(SM sm) {
		return smRepository.save(sm);
	}

	@Transactional
	public void deleteSM(SM sm) {
		smRepository.deleteById(sm.getSeq());
	}
	
//	@Transactional
//	public void updateSM(SM sm) {
//		return smRepository.save(sm);
//	}
}
