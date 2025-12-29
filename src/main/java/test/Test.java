package test;

//import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import day1226.SelectDAO2;
import kr.co.sist.car.CarDAO;

public class Test {

	@org.junit.Test
//	@DisplayName("select 테스트")
	public void test() {
//		SelectService ss=SelectService.getInstance();
//		assertNotNull(ss.scsr(10));
//		assertEquals(ss.scsr(10),"ACCOUNTINGGG");
//		assertNotNull(ss.scmr(10));
		
//		SelectDAO sDAO=SelectDAO.getInstance();
////		EmpDTO eDTO=sDAO.mcsr(7788);
//		List<EmpDTO> list=sDAO.mcmr(10);
//		System.out.println(list);
////		assertNotNull(list);
//		assertEquals(list.size(), 3);
		
//		day1226.EmpDTO eDTO=new day1226.EmpDTO();
//		eDTO.setEmpno(7521);
//		eDTO.setDeptno(30);
		
//		SelectDAO2 sDAO=SelectDAO2.getInstance();
		CarDAO cDAO=CarDAO.getInstance();
//		EmpDomain ed=sDAO.useDomain(eDTO);
//		assertNotNull(ed);
		try {
		//assertNotNull(sDAO.useLike("대치동"));
//			assertNotNull(sDAO.greaterThan(3000));
//			assertNotNull(sDAO.subquery());
//			assertNotNull(sDAO.union());
//			assertNotNull(sDAO.join());
//			assertNotNull(cDAO.selectMaker("국산"));
			assertNotNull(cDAO.selectMaker("현대"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
