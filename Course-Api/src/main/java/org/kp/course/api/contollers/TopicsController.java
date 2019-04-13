package org.kp.course.api.contollers;

import java.util.List;
import org.kp.course.api.model.Topic;
import org.kp.course.api.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/topics",method=RequestMethod.GET)
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.GET)
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic,@PathVariable("id") String id){
                topic.setId(id);
		topicService.updateTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
