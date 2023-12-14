package com.ctel.hpfs.entity;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


 @Document("Cases")  
public class Cases implements Serializable{

private   List<Case> Case;


    public void setCase(List<Case> Case) {
        this.Case = Case;
    }
    public List<Case> getCase() {
        return Case;
    }
    
}