package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import day1224.EmpDTO;
import day1224.SelectDAO;
import day1224.SelectService;

public class Test2 {

	@org.junit.Test
	public void test() {
		SelectService ss=SelectService.getInstance();
		//assertNotNull(ss.scsr(10));
		//assertEquals(ss.scsr(10),"ACCOUNTING");
//		assertNotNull(ss.scmr(10));
		SelectDAO sDAO=SelectDAO.getInstance();
//		EmpDTO eDTO=sDAO.mcsr(7788);
		List<EmpDTO> list=sDAO.mcmr(10);
		System.out.println(list);
		assertNotNull(list);
		//assertEquals(list.size(), 1);
	}

}
