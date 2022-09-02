package lastcoder.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;


@Component
public class QueryDao {

	private static SessionFactory factory;
	private static Session session;

//	private GetType getType;	

	public static <T> SessionFactory getInstance(T type) {

		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(type.getClass())
				.buildSessionFactory();

		return factory;
	}

//	public <T> ArrayList<T> QuerySelect(T type) {
//
//		factory = getInstance(type);
//		session = factory.getCurrentSession();
//		session.beginTransaction();
//		
//		
//		// Find All
//		ArrayList<T> queryList = (ArrayList<T>)entityRepository.findAll();
//		
//
//		session.getTransaction().commit();
//		factory.close();
//
//		return queryList;
//	}

//	// CREATE
//	public <T> ArrayList<?> QuerySelect(T type) {
//
//		// session 객체를 Factory에서 얻어오고 트랜잭션 준비
//		factory = getInstance(type);
//		session = factory.getCurrentSession();
//		String query = "from " + type.toString().split("\\.")[2].split("@")[0];
//
//		try {
//			session.beginTransaction();
//			try {
//				tmp_list = (ArrayList<T>) session.createQuery(query).getResultList();
////				tmp_list = (ArrayList<?>) session.get(type.getClass(), "`유치원`");
//
//			} catch (TypeMismatchException e) {
//				e.printStackTrace();
//				System.out.println(e);
//				// TODO: handle exception
//			}
//// 			DB에 저장할 때만 save
////			session.save();
//			session.getTransaction().commit();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(e);
//
//		} finally {
//			factory.close();
//
//		}
//
//		return tmp_list;
//	}
//
//	// GET
//	public <T, K> ArrayList<?> QuerySelect(T type, K key) {
////		List<T> type_list = new ArrayList<>();
//
//		factory = getInstance(type);
//		session = factory.getCurrentSession();
//
//		try {
//			session.beginTransaction();
//			tmp_list = (ArrayList<?>) session.get((Class<T>) type, "`유치원`");
//// 			DB에 저장할 때만 save
////			session.save();
//			session.getTransaction().commit();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//
//		} finally {
//			factory.close();
//
//		}
//		return tmp_list;
//
//	}
//	public List<EnterenceRate> EprateQuerySelectAll() {
//		// session 객체를 Factory에서 얻어오고 트랜잭션 준비
//		tmp_list = new ArrayList<EnterenceRate>();
//		
//		try {
//					
//			// 전체조회
//
////			enterenceRate.add(session.get(EnterenceRate.class, 1));
////			System.out.println(session.createQuery("from EnterenceRate"));
////			System.out.println(enterenceRate);
//// 			DB에 저장할 때만 save
////			session.save();
//			session.getTransaction().commit();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//
//		} finally {
//			factory.close();
//
//		}
//		return enterenceRate;
//	}
//
//	public List<Compositeeconomicindex> CompositeeconomicindexQuerySelectAll() {
//		// session 객체를 Factory에서 얻어오고 트랜잭션 준비
//		factory = getInstance();
//		session = factory.getCurrentSession();
//		List<Compositeeconomicindex> Compositeeconomicindex = null;
//		// beginTransaction -> save -> commit
//		try {
//
//			session.beginTransaction();
//			// 전체조회
//
//			Compositeeconomicindex = session.createQuery("from Compos").getResultList();
//
//			// DB에 저장할 때만 save
////			session.save();
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//
//		} finally {
//			factory.close();
//		}
//
//		return Compositeeconomicindex;
//	}
//	

}
