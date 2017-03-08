package me.rahulgaikwad.springsample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleTest {
	public static void main(String [] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SampleApplication.class);
		SamplePOJO samplePOJOBean = context.getBean(SamplePOJO.class);
		samplePOJOBean.printGreetings();
		context.close();
	}
}
