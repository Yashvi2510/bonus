import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testEmployee() {
		Employee em = new Employee();
		em.setHour(30);
		em.setTotalPay();
		assertEquals(450.0, em.getTotalPay());
	}
	@Test
	void testEmployee1() {
		Employee em = new Employee();
		em.setHour(50);
		em.setTotalPay();
		assertEquals(765.0, em.getTotalPay());
	}

}
