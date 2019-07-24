package com.demo.ipserver.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ipserver.model.ServerDetails;

public interface ServerRepository extends JpaRepository<ServerDetails, Integer> {

	List<ServerDetails> findByServerIp(String ip);
}
