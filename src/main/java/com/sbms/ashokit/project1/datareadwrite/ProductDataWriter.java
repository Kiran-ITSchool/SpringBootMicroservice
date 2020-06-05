package com.sbms.ashokit.project1.datareadwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductDataWriter {

	public void writeToFile(ArrayList<String> result) throws IOException {
		String outFile = "src//main//resources//output.txt";
		FileWriter writer = new FileWriter(outFile); 
		for(String str: result) {
		  writer.write(str + System.lineSeparator());
		}
		writer.close();
	}

}
