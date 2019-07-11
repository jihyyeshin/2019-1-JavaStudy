package com.spring.ex01;

//xml�� �о�� ���� �����Ͽ� ����Ѵ�.
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));//person.xml�� �Ϥ���
		PersonService person = (PersonService) factory.getBean("personService");//id�� personService�� ���� ����
		// PersonService person = new PersonServiceImpl();//��ü�� ���� �������� ������ �ǹ�
		person.sayHello();//name���� ����Ѵ�.
	}

}