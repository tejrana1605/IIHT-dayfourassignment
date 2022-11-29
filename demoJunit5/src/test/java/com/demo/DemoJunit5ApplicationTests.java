package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DemoJunit5ApplicationTests {

	private Cal c=new Cal();
	
	@Test
	void testSum() {
		int exRes=12;
		int acRes=c.doSum(6,3,3);
		assertThat(acRes).isEqualTo(exRes);
	}
	@Test
	void testProduct() {
		int exRes=9;
		int acRes=c.doProduct(3,3);
		assertThat(acRes).isEqualTo(exRes);
	}
	@Test
	void contextLoads() {
		Boolean acRes=c.campTonum(3,3);
		assertThat(acRes).isTrue();
	}

}
