package com.poscoict.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/poscoict/container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	// @Autowired
	// 예외발생
	// Explicit XML Bean 설정(Avengers)에서는 id를 자동 부여 하지 않는다.
	// 따라서 @Qualifier를 사용할 수 없다.
	private DigitalVideoDisc dvd1;

	@Qualifier("ironMan")
	@Autowired
	private DigitalVideoDisc dvd2;

	@Qualifier("avengersInfinityWar")
	@Autowired
	private DigitalVideoDisc dvd3;

	@Qualifier("avengersEndgame")
	@Autowired
	private DigitalVideoDisc dvd4;

	@Qualifier("avengersAgeOfUltron")
	@Autowired
	private DigitalVideoDisc dvd5;

	@Qualifier("avengersCaptainAmerica")
	@Autowired
	private DigitalVideoDisc dvd6;

	@Qualifier("avengersDirectorEdition")
	@Autowired
	private DigitalVideoDisc dvd7;

	@Qualifier("avengersExpansionEdition1")
	@Autowired
	private DigitalVideoDisc dvd8;

	@Qualifier("avengersExpansionEdition2")
	@Autowired
	private DigitalVideoDisc dvd9;
	
	@Qualifier("avengersExpansionEdition3")
	@Autowired
	private DigitalVideoDisc dvd10;	
	
	@Autowired
	private DVDPack dvdPack;
	
	@Qualifier("dvdPlayer1")
	@Autowired
	private DVDPlayer dvdPlayer1;

	@Qualifier("dvdPlayer2")
	@Autowired
	private DVDPlayer dvdPlayer2;

	@Qualifier("dvdPlayer3")
	@Autowired
	private DVDPlayer dvdPlayer3;

	@Qualifier("dvdPlayer4")
	@Autowired
	private DVDPlayer dvdPlayer4;
	
	@Qualifier("dvdPlayer5")
	@Autowired
	private DVDPlayer dvdPlayer5;
	
	@Ignore
	@Test
	public void testDvd1() {
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDvd2() {
		assertNotNull(dvd2);
	}

	@Test
	public void testDvd3() {
		assertNotNull(dvd3);
	}

	@Test
	public void testDvd4() {
		assertNotNull(dvd4);
	}

	@Test
	public void testDvd5() {
		assertNotNull(dvd5);
	}

	@Test
	public void testDvd6() {
		assertNotNull(dvd6);
	}

	@Test
	public void testDvd7() {
		assertNotNull(dvd7);
	}

	@Test
	public void testDvd8() {
		assertNotNull(dvd8);
	}
	
	@Test
	public void testDvd9() {
		assertNotNull(dvd9);
	}
	
	@Test
	public void testDvd10() {
		assertNotNull(dvd10);
	}		

	@Test
	public void testDvdPack() {
		assertNotNull(dvdPack);
	}
	
	@Test
	public void testPlay1() {
		dvdPlayer1.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay2() {
		dvdPlayer2.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testPlay3() {
		dvdPlayer3.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testPlay4() {
		dvdPlayer4.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testPlay5() {
		dvdPlayer5.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}