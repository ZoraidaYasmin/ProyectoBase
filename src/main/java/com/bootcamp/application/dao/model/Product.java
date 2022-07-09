package com.bootcamp.application.dao.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "product")
public class Product {

    @BsonId
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    private String productType;
    private String productTypeDes;
    private String productInd;
    private String productIndDes;
    private Audit audit;

}
