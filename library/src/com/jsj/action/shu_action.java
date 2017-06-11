package com.jsj.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.jsj.model.*;

import org.junit.Test;
public class shu_action {
	@Test

	public void add(String userName,String password){
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		guanliyuan s = new guanliyuan();
		s.setUsername(userName);
        s.setPassword(password);
		session.save(s);
		session.getTransaction().commit();
		sf.close();
		
	}
	public boolean alias(String userName){
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.clear();
		session.beginTransaction();
		String hql="from guanliyuan where username='"+userName+"'";
		Query query=session.createQuery(hql);
		List<Shu> ss=query.list();
		if(ss.size()>0){
			session.getTransaction().commit();
			session.close();
			sf.close();
			return true;
		}else{
			session.getTransaction().commit();
			session.close();
			sf.close();
			return false;
		}
		
		
	}
	@Test
	public boolean paramName(String userName,String password){
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from guanliyuan where username=:name and password=:word";
		Query query=session.createQuery(hql);
		query.setParameter("name",userName);
		query.setParameter("word",password);
		List<guanliyuan> ss=query.list();
		if(ss.size()>0){
			session.getTransaction().commit();
			session.close();
			sf.close();
			return true;
		}
		
		//for(Student s:ss){
		//	System.out.println(s.getUsername()+" "+s.getPassword());
		//}
		
		return false;
	}
	public static String check(String bookname,String cbs){
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from Shu where shuming like:name and chubanshe like:word";
		Query query=session.createQuery(hql);
		query.setParameter("name",bookname);
		query.setParameter("word",cbs);
		List<Shu> ss=query.list();
		if(ss.size()>0){
			String str="<table><tr><td>���</td><td>����</td><td>������</td><td>����</td></tr>";
			for(Shu s:ss){
			 str+="<tr><td>"+s.getShuhao()+"</td><td>"+s.getShuming()+"</td><td>"+s.getChubanshe()+"</td><td>"+s.getZuozhe()+"</td></tr>";
			}
			str+="</table>";
			return str;
		}else{
			return "û�з��������Ĳ�ѯ";
		}
	}
	public static String checkandview(String shuming,String chubanshe){
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from Shu where shuming like ? and chubanshe like ? ";
		Query query=session.createQuery(hql);
		query.setParameter(0,"%"+shuming+"%");
		query.setParameter(1,"%"+chubanshe+"%");
		List<Shu> ss=query.list();
		if(ss.size()>0){
			String str="<table><tr><td>���</td><td>����</td><td>������</td><td>����</td></tr>";
			for(Shu s:ss){
			 str+="<tr><td>"+s.getShuhao()+"</td><td>"+s.getShuming()+"</td><td>"+s.getChubanshe()+"</td><td>"+s.getZuozhe()+"</td></tr>";
			}
			str+="</table>";
			return str;
		}else{
			return "û������";
		}
	}
	public static String checkall(){
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		String hql="from Shu";
		Query query=session.createQuery(hql);
		List<Shu> ss=query.list();
		if(ss.size()>0){
			String str="<table><tr><td>���</td><td>����</td><td>������</td><td>����</td></tr>";
			for(Shu s:ss){
			 str+="<tr><td>"+s.getShuhao()+"</td><td>"+s.getShuming()+"</td><td>"+s.getChubanshe()+"</td><td>"+s.getZuozhe()+"</td></tr>";
			}
			str+="</table>";
			return str;
		}else{
			return "û������";
		}
	}
		public static String checkone1(String bookname){
		
			Configuration config=new Configuration().configure();
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session session=sf.openSession();
			session.beginTransaction();
			String a=Bytes(bookname);
			String hql="from Shu where shuming like ? ";
			Query query=session.createQuery(hql);
			query.setParameter(0,"%"+a+"%");
			List<Shu> ss=query.list();
			if(ss.size()>0){
				String str="<table><tr><td>���</td><td>����</td><td>������</td><td>����</td></tr>";
				for(Shu s:ss){
				 str+="<tr><td>"+s.getShuhao()+"</td><td>"+s.getShuming()+"</td><td>"+s.getChubanshe()+"</td><td>"+s.getZuozhe()+"</td></tr>";
				}
				str+="</table>";
				return str;
			}else{
				return a+"û������";
			}
		}
		public static String checkone2(String cbs){
			Configuration config=new Configuration().configure();
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session session=sf.openSession();
			session.beginTransaction();
			String hql="from Shu where chubanshe like ? ";
			Query query=session.createQuery(hql);
			query.setParameter(0,"%"+cbs+"%");
			List<Shu> ss=query.list();
			if(ss.size()>0){
				String str="<table><tr><td>���</td><td>����</td><td>������</td><td>����</td></tr>";
				for(Shu s:ss){
				 str+="<tr><td>"+s.getShuhao()+"</td><td>"+s.getShuming()+"</td><td>"+s.getChubanshe()+"</td><td>"+s.getZuozhe()+"</td></tr>";
				}
				str+="</table>";
				return str;
			}else{
				return cbs+"û������";
			}
		}
		public static String Bytes(String str)
		{
		 try
		 {
		  String str_1=str;
		  byte[] str_2=str_1.getBytes("GB2312");
		  String bytes=new String(str_2);
		  return bytes;
		 }
		  catch(Exception e)
		 {
		  System.out.println("�����������������"+e.getMessage());
		 }
		 return "null";
		}
		
	}
	
