package com.demo.ipserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ipserver.dao.ServerRepository;
import com.demo.ipserver.model.ServerDetails;

@Service
public class ServerService {
	@Autowired
	private ServerRepository repository;

	public void addServer(ServerDetails server) {
		repository.save(server);
	}
	
	public List<ServerDetails> findAllServer(){
		return repository.findAll();
	}
	
	public List<ServerDetails> findByIp(String ip) {
		return repository.findByServerIp(ip);
	}
}
