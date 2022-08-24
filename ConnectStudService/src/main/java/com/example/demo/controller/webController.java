package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
@RefreshScope
public class webController 
{
	@Value("${server.port}")
	private String port;
	
	@Value("${my.app.title}")
	private String msg;
	
	@Autowired
	private connectuser connectu;
	
	@GetMapping("/get")
	public ResponseEntity<?> getStdu()
	{
		return new ResponseEntity<String>("Connect ->"+msg +connectu.prodAll() +port, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> getStdusave(@RequestBody Product product)
	{
		return new ResponseEntity<String>("Connect ->" +connectu.prodsave(product), HttpStatus.OK);
	}
	
	@GetMapping("/get/{sid}")
	public ResponseEntity<?> getStduone(@PathVariable Integer sid)
	{
		return new ResponseEntity<String>("Connect ->" +connectu.prodfindOne(sid), HttpStatus.OK);
	}
	
	@DeleteMapping("/delet/{sid}")
	public ResponseEntity<?> getStduonedelet(@PathVariable Integer sid)
	{
		return new ResponseEntity<String>("Connect ->" +connectu.prodDelete(sid), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> getStduoneupdate(@RequestBody Product p)
	{
		return new ResponseEntity<String>("Connect ->" +connectu.produpdate(p), HttpStatus.OK);
	}
	
	@PatchMapping("/update/{sid}/{sstd}")
	public ResponseEntity<?> getStduoneupdatemodi(@PathVariable Integer sid, @PathVariable String sstd)
	{
		return new ResponseEntity<String>("Connect ->" +connectu.produpdateSub(sid,sstd), HttpStatus.OK);
	}
	
	
}
