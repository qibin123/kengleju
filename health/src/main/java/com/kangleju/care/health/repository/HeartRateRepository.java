package com.kangleju.care.health.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.kangleju.care.health.model.HeartRateData;

public interface HeartRateRepository extends CrudRepository<HeartRateData, String> {
	HeartRateData findByCustomerUuid(String customerUuid);
	HeartRateData findByCustomerUuidAndDate(String userUuid, String date);
	
	@Query(value="{'customerUuid' : ?0}", fields="{date : 1, rate: 1, _id : 0}")
	List<HeartRateData> findDataItemsExcludeId(String customerUuid, Pageable pageable);
}
