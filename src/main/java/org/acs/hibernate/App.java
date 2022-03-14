package org.acs.hibernate;

import org.acs.hibernate.util.HibernateUtillty;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Iterator;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
      
	SessionFactory sessionFactory = (SessionFactory) HibernateUtillty.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	Query query = session.createQuery("select c.customerId,c.customerName,c.mobileNumber,c.mail from Customer c" +" "+ "left join c.items i");
	
	List list = query.list();
  Iterator iterator  = query.iterate();
  while (iterator.hasNext()) {
	  Object rows[] = (Object[])iterator.next();
      System.out.println(rows[0]+ " -- " +rows[1] + "--"+rows[2]);
	
}
  session.close();
  
}

	
}
