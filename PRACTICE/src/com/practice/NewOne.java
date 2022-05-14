package com.practice;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewOne {

	public static void main(String[] args) {
		processData();
	}
	static void processData() {
		try (Stream<String> data = Files.lines(Paths.get("D:\\Data.txt"))) {
			Set<String> ipsDetails = data.map(line -> line.split("\\$#\\$ip#\\$#")[1].split("~\\$~sessionId")[0])
					.collect(Collectors.toSet());
			System.out.println("Unique IP address");
			System.out.println("===============================");
			ipsDetails.stream().forEach(System.out::println);
			System.out.println();
			System.out.println("Unique IP address Count :");
			System.out.println("===============================");
			System.out.print(ipsDetails.size());
			ipsDetails.stream().forEach( ip ->{
				//Stream<Object> value =data.filter(detail -> detail.contains(ip)).map(lines -> lines.split("PageLoadTime#\\$#")[1].split("~\\$~FirstbyteTime")[0]).;
				//data.filter(detail -> detail.contains(ip)).map(lines -> lines.split("PageLoadTime#\\$#")[1].split("~\\$~FirstbyteTime")[0]).forEach(System.out::println);
			});;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
