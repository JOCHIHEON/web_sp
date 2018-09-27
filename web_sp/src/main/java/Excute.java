import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdi.sp.vo.BoardInfoVO;
import com.bdi.sp.vo.TestVO;

public class Excute {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpac = 
				new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SqlSession ss = (SqlSession)cpac.getBean("sst");
		BoardInfoVO bi = new BoardInfoVO();
		bi.setBinum(6);
		System.out.println(ss.getConnection());
		System.out.println(ss.selectOne("BOARD.selectBoard",bi));
	}
}
