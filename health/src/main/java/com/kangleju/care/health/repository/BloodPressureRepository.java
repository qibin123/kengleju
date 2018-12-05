package com.kangleju.care.health.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.kangleju.care.health.model.BloodPressureData;

public interface BloodPressureRepository extends CrudRepository<BloodPressureData, String> {
	BloodPressureData findByCustomerUuid(String customerUuid);
	BloodPressureData findByCustomerUuidAndDate(String userUuid, String date);
	
	@Query(value="{'customerUuid' : ?0}", fields="{date : 1, dbp: 1, sbp: 1, _id : 0}")
	List<BloodPressureData> findDataItemsExcludeId(String customerUuid, Pageable pageable);
}
