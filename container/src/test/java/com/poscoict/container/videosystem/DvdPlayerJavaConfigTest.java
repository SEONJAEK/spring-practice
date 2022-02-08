package com.poscoict.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poscoict.container.config.videosystem.DvdPlayerConfig;
//runner가 container를 만들수있게 해줘야함
@RunWith(SpringJUnit4ClassRunner.class)
//컨테이너 환경 만들엉줌
@ContextConfiguration(classes= {DvdPlayerConfig.class})
public class DvdPlayerJavaConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd;
	
	@Autowired
	private DVDPlayer dvdPlayer;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNotnull() {
		assertNotNull(dvdPlayer);
	}
	
	@Test
	public void testPlay() {
		dvdPlayer.play();
		assertEquals("Playing Movie MARVEL's Avengers",  systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
