package com.bootcamp.application.dao.model;

import lombok.Data;

@Data
public class Audit {

    private String userReg;
    private String regDate;
    private String userMod;
    private String modDate;

}
