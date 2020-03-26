package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("java","java Framework","java Framework Description"),
			new Topic("JavaScript","JavaScript Framework","JavaScript Framework Description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}


}
