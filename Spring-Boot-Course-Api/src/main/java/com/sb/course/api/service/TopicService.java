package com.sb.course.api.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.course.api.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList( new Topic(1,"Java","Java Description"),
			new Topic(2,"Java","Java Description"),
			new Topic(3,"Java","Java Description"));
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(int id) {
		return topics.stream().filter(t->t.getId() == id).findFirst().get();
	}
	
}
