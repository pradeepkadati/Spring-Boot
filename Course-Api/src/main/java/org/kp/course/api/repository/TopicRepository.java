/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kp.course.api.repository;

import org.kp.course.api.entity.TopicEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kadat
 */
public interface TopicRepository extends CrudRepository<TopicEntity, String> {
    
}
