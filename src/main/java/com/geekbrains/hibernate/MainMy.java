package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainMy {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Visitor.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        //выборка всех курсов
        //List<Course> result = session.createQuery("from Student").getResultList();
        //выборка всех студентов
        //List<Student> result = session.createQuery("from Course").getResultList();
        //выборка всех студентов на курсе с
        List<Student> result = session.createQuery("from Course s where s.name = :name").setParameter("name","c").getResultList();
        System.out.println(result);
        //удаление студента джон
//       Student result = session.get(Student.class, 1);
//        session.delete(result);
        session.getTransaction().commit();
    }
}
