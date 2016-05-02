package base;

import static org.junit.Assert.*;

import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		PersonDomainModel person1 = new PersonDomainModel();
		PersonDomainModel person2 = new PersonDomainModel();
		
		UUID person1_id = UUID.randomUUID();
		UUID person2_id = UUID.randomUUID();
		
		person1.setPersonID(person1_id);
		person2.setPersonID(person2_id);
		
		
		person1.setCity("Omaha");
		person2.setCity("Dallas");
		
		
		person1.setFirstName("Jim");
		person2.setFirstName("John");
		
		person1.setLastName("Greinke");
		person2.setLastName("Parker");
		
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
		
		PersonDAL.updatePerson(person1);
		PersonDAL.updatePerson(person2);
		 
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PersonDomainModel person1 = new PersonDomainModel();
		PersonDomainModel person2 = new PersonDomainModel();
		
		UUID person1_id = UUID.randomUUID();
		UUID person2_id = UUID.randomUUID();
		
		person1.setPersonID(person1_id);
		person2.setPersonID(person2_id);
		
		
		person1.setCity("Omaha");
		person2.setCity("Dallas");
		
		
		person1.setFirstName("Jim");
		person2.setFirstName("John");
		
		person1.setLastName("Greinke");
		person2.setLastName("Parker");
		
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
		
		PersonDAL.updatePerson(person1);
		PersonDAL.updatePerson(person2);
		
		assertEquals(PersonDAL.getPerson(person1_id), null);
		assertEquals(PersonDAL.getPerson(person2_id), null);
		
		
		
	}

}
