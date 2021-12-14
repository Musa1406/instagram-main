package business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import business.services.ReelsService;
import database.ReelsDao;
import entity.Reels;

@Service
public class ReelsManager implements ReelsService{
	private ReelsDao reelsDao;
	 @Autowired
	public ReelsManager(ReelsDao reelsDao) {
		super();
		this.reelsDao = reelsDao;
	}
	 @Override
	 public ArrayList<Reels> getAll(){
		 
		 return new ArrayList<Reels>(reelsDao.findAll());
	 }
}
