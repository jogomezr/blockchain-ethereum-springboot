package com.example.blockchain.ethereum;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class EthereumApplicationTests {

//	@Test
	void contextLoads() {
	}
	
	@Test
	public void formatDates() {
		
		String sourceDate = "2021-11-05T12:01:00";
		LocalDateTime  targetDate = LocalDateTime .parse(sourceDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		String formattedDate = targetDate.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		assertTrue(targetDate != null);
		assertTrue(sourceDate.equals(formattedDate));
		
	}

}
