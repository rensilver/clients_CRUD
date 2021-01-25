package com.crud.clients.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.clients.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Silva", "12345678901", 6500.0, Instant.parse("1994-07-20T10:30:00Z"), 2));
		list.add(new Client(2L, "João Pereira", "98745632102", 6500.0, Instant.parse("1995-08-21T11:30:00Z"), 3));
		return ResponseEntity.ok().body(list);
	}
}
