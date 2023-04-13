package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;
<<<<<<< HEAD
=======
@GetMapping
>>>>>>> 976bc4157f447cbbcb77ec2830ed82c3a2c5ba96
@RestController
@RequestMapping("/Postagens")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class PostagemController {

@Autowired
private PostagemRepository postagemRepository;

@GetMapping
public ResponseEntity<List<Postagem>> getAll(){
	return ResponseEntity.ok(postagemRepository.findAll());
}
}