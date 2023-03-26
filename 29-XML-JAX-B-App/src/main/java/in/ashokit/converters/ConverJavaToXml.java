package in.ashokit.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Person;

public class ConverJavaToXml {

	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");

		Person person = new Person();
		person.setId(101);
		person.setName("John");
		person.setAge(25);
		person.setPhno(12575757l);
		person.setType("Docter");
		person.setAdress(addr);

		JAXBContext instance = JAXBContext.newInstance(Person.class);

		Marshaller marshaller = instance.createMarshaller();

		marshaller.marshal(person, new File("Person.xml"));

		System.out.println("Marshalling Completed....");
	}
}
