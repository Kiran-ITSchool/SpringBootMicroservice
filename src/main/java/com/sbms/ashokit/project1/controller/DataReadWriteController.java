package com.sbms.ashokit.project1.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.sbms.ashokit.project1.datareadwrite.ProductDataReader;
import com.sbms.ashokit.project1.datareadwrite.ProductDataWriter;

@Controller
public class DataReadWriteController {
	
	@Autowired
	private ProductDataReader read;
	
	@Autowired
	private ProductDataWriter write;
	
	@Bean
	public void readAndWrite() throws IOException {
		ArrayList<String> result = (ArrayList<String>) read.readData();
		write.writeToFile(result);
		write.writeToFile(result);
		System.out.println("test");
	}

}
