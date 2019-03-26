package com.sb.course.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.course.api.model.Topic;
import com.sb.course.api.service.TopicService;

@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/topics",method=RequestMethod.GET)
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.GET)
	public Topic getTopic(@PathVariable int id) {
		return topicService.getTopic(id);
	}
}
