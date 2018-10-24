package com.cg.client;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.dao.JPAUtil;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService service = new BookServiceImpl();
		BookDao dao=new BookDaoImpl();
		EntityManager entityManager=JPAUtil.getEntityManager();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		Book book=dao.getBookById(102);
		System.out.println(book);
		Query query = entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		
		for(Book book2: bookList)
		{
			System.out.println(book2);
		}
	}

}
