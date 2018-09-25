package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class FishTest {
	private Fish fish = new Fish("voorem", "Danny", 4.20, 6.9);
	@Test
	public void test_Constructor_with_given_type() {
		assertEquals("voorem", fish.getType());
	}
	
	@Test
	public void test_Constructor_with_given_nickname() {
		assertEquals("Danny", fish.getNickname());
	}
	
	@Test
	public void test_Constructor_with_given_weight() {
		assertEquals(4.20, fish.getWeight(), 0.001);
	}
	
	@Test
	public void test_Constructor_with_given_length() {
		assertEquals(6.9, fish.getLength(), 0.1);
	}
	
	@Test
	public void test_getNickname_if_null_or_empty(){
		Fish fish2 = new Fish("braasem", 6.9 , 4.20);
		assertEquals("this fish has no nickname", fish2.getNickname());
	}
	
	@Test(expected = DomainException.class)
	public void test_setType_not_null(){
		fish.setType("");
	}
	
	@Test(expected = DomainException.class)
	public void test_setWeight_exception_if_to_low(){
		fish.setWeight(0.0000000000001);
	}
	
	@Test(expected = DomainException.class)
	public void test_setWeight_exception_if_to_high(){
		fish.setWeight(300000000);
	}
	
	@Test(expected = DomainException.class)
	public void test_setheight_exception_if_to_low(){
		fish.setLength(0);
	}
	
	@Test(expected = DomainException.class)
	public void test_setheight_exception_if_to_high(){
		fish.setLength(9999999);
	}

}
