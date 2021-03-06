package com.mindtree.mystayapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.mystayapplication.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	
	List<Room> findByroomType(String roomType);
}
