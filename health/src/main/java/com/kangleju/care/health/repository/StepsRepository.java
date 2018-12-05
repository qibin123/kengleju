package com.kangleju.care.health.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kangleju.care.health.model.StepsData;

public interface StepsRepository extends CrudRepository<StepsData, String> {
	StepsData findByCustomerUuid(String customerUuid);
	StepsData findByCustomerUuidAndDate(String userUuid, String date);
	
	@Query(value="{'customerUuid' : ?0}", fields="{date : 1, value: 1, _id : 0}")
	List<StepsData> findDataItemsExcludeId(String customerUuid, Pageable pageable);
}
