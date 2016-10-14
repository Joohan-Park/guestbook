package com.bit2016.guestbook.dao.test;

import java.util.List;

import com.bit2016.guestbook.dao.GuestBookDao;
import com.bit2016.guestbook.vo.GuestBookVo;

public class GuestBookTest {

	public static void main(String[] args) {
			//insertTest();
			deleteTest();
			getListTest();
			
		}
		
		public static void getListTest() {
			GuestBookDao dao = new GuestBookDao();
			List<GuestBookVo> list = dao.getList();

			for (GuestBookVo vo : list) {
				System.out.println(vo);
			}
		}
		
		public static void insertTest(){
			GuestBookVo vo = new GuestBookVo();
			vo.setName("주한박");
			vo.setPassword("1234");
			vo.setRegDate("2016-03-04");
			vo.setContent("안녕하세요 나는 주한박 입니다.");
			
			GuestBookDao dao = new GuestBookDao();
			dao.insert(vo);
		}
		public static void deleteTest(){
			GuestBookDao dao = new GuestBookDao();
			
			dao.delete(4L,"1234");

			
		}

	}


