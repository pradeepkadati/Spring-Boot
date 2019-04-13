package org.kp.course.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.kp.course.api.entity.TopicEntity;
import org.kp.course.api.model.Topic;
import org.kp.course.api.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;
    
    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();

        topicRepository.findAll().forEach(te -> {
            topics.add(entityToModelConvertor.apply(te));
        });
        return topics;
    }
    
    public Topic getTopic(String id) {
        TopicEntity te = topicRepository.findById(id).get();
        return entityToModelConvertor.apply(te);
    }
    
    public void addTopic(Topic t) {
        topicRepository.save(modelToEntityConvertor.apply(t));
    }
    
    public void updateTopic(Topic t) {
       topicRepository.save(modelToEntityConvertor.apply(t));        
    }
    
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
    
    private final Function<TopicEntity,Topic> entityToModelConvertor = (te)-> {
        Topic topic = new Topic(te.getId(), te.getName(), te.getDescription());
        return topic;
    };
    
    private final Function<Topic,TopicEntity> modelToEntityConvertor = (t) -> {
        
        TopicEntity te = new TopicEntity();
        te.setDescription(t.getDescription());
        te.setName(t.getName());
        te.setId(t.getId());
        
        return te;
    };
}
