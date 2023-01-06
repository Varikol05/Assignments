package com.assignments.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	 public static void main(String[] args) {
        


         // calling list of answer
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
          Question question =(Question)context.getBean("question");
         question.displayAnswerList();




         // calling set of answer
          System.out.println("=====================================");
          ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");

          Question question1 =(Question)context.getBean("question1");
          question1.displayAnswerSet();



         // calling map of answer
          System.out.println("=====================================");
          ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");

          Question question2 =(Question)context.getBean("question2");
          question2.displayAnswerMap();



     }
  
      



 }

 

