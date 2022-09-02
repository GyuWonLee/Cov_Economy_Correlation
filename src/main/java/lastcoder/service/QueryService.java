package lastcoder.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lastcoder.Entity.EnterenceRate.EnterenceRate;
import lastcoder.dao.QueryDao;

@Service
@Transactional
public class QueryService <T>{
	
	
	@Autowired
	private QueryDao queryDao;

	public QueryService(QueryDao queryDao) {
		this.queryDao = queryDao;
	}


//	//create
//	public <T> ArrayList<T> SelectQuery(T type){
//		ArrayList<T> tmp_List = queryDao.QuerySelect(type);
//		return tmp_List;
//	}
//	

}
