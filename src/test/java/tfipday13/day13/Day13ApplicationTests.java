package tfipday13.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day13ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testifthingswork(){
		users testUser=new users();
		testUser.setemailAdd("test@test.com");
		testUser.setname("tester account");
		testUser.setphoneNum("76543218");
		assertEquals(testUser.getemailAdd(),"test@test.com");
		assertTrue(testUser.getname().equals("tester account"));
		assertEquals(testUser.getphoneNum(), "76543218");
	}

}
