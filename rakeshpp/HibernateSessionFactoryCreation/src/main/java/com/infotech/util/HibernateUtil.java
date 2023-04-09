package com.infotech.util;

import com.mysql.cj.protocol.StandardSocketFactory;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {
	
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;
	
	static {
		if(sessionFactory==null) {
			standardServiceRegistry=new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metadataSources=new MetadataSources(standardServiceRegistry);
			Metadata  metadata = metadataSources.getMetadataBuilder().build();
			sessionFactory=m
		}
		
	}
	

}
