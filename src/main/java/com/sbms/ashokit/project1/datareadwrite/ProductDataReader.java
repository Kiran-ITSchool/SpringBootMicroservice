package com.sbms.ashokit.project1.datareadwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class ProductDataReader {

	public List<String> readData() {
		String inputFile = "src//main//resources//input.txt";
		List<String> out = new ArrayList<String>();
		try {
			Stream<String> stream = Files.lines(Paths.get(inputFile));
			List<String> list = stream.map(e -> e.trim()).collect(Collectors.toList());
			for (String res : list) {
				String str[] = res.split(",");
				if (Double.valueOf(str[2]) > 5000.00) {
					out.add(res);
				}
			}
			System.out.println(out);
		} catch (IOException e) {
			System.out.println("File Read Error");
		}
		return out;
	}

}
