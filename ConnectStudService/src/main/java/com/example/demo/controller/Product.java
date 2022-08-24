package com.example.demo.controller;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product 
{
	private Integer sid;
	
	private String snm;

	private String sstd;

	private Set<String> ssub;
}
