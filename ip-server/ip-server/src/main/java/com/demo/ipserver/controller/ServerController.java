package com.demo.ipserver.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ipserver.model.ServerDetails;
import com.demo.ipserver.service.ServerService;

@RestController
@CrossOrigin(origins = "*")
public class ServerController {
@Autowired
ServerService service;

@GetMapping("/{ip:.+}")
public List<ServerDetails> getServer(@PathVariable String ip) {
	return service.findByIp(ip);
}

@GetMapping("/getAll")
public List<ServerDetails> getAllServers(){
	return service.findAllServer();
}

@PostMapping
public void addServer(@RequestBody ServerDetails server) {
	service.addServer(server);
}
}
