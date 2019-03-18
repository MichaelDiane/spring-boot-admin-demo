package com.taolue.baoxiao.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaoxiaoAdminClientApplicationTests {

	@Test
	public void testTrue() {
		boolean flag=false;
		
		if((1==1 || 1==2 )&& flag) {
			System.out.println("==============>"+1);
		}
		
	}

}

