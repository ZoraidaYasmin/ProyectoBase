package com.bootcamp.application.dao.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
@Data
public class Client {

    @BsonId
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    private String name;
    private String lastName;
    private String dni;
    private String customerType;
    private String customerTypeDes;
    private Audit audit;

}
