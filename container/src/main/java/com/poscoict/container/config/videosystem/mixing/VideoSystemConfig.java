package com.poscoict.container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.poscoict.container.config.videosystem.DVDPlayerConfig;

/**
 * 
 * <------ javaConfig1(DVDConfig) + JavaConfig2(DVDPlayerConfig)
 *	import
 *
 *	JavaConfig1  +  JavaConfig2
 *	
 */
@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {
	
}
