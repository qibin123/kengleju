package com.kangleju.care.iotservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection = "MessageData")
@Builder
public class MessageData {
	@Id
	String id;

	String type; //根据type来定义给用户推送提示  type=1 SOS，type=2 fall，type=3 new 新成员加入 ，type=4 电子围栏触发， type=5 设备低电，type=6 环境音'''
	String deviceid;
	String communityid;
	String url;
	String name;
}
