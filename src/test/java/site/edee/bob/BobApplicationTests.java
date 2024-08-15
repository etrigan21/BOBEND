package site.edee.bob;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import site.edee.bob.services.user.PasswordUtils;

@SpringBootTest
class BobApplicationTests {

	@Test 
	void testHashPassword(){		
		String password = "elementaryDearWatson";
		String hashedPassword = PasswordUtils.hashPassword(password);
		assertNotNull(hashedPassword, "Hashed password should not be null");
		assertNotEquals(password, hashedPassword, "Password and hashed password should not be null");
	}

	@Test 
	void testCheckPassword(){
		String password = "elementaryDearWatson";
		String hashedPassword = PasswordUtils.hashPassword(password);
		boolean result = PasswordUtils.checkPassword(password, hashedPassword);
		assertEquals(result,true, "Password and hash should be equal");

	}

}
