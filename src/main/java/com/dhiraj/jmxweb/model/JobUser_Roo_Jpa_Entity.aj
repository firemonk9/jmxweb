// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dhiraj.jmxweb.model;

import com.dhiraj.jmxweb.model.JobUser;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect JobUser_Roo_Jpa_Entity {
    
    declare @type: JobUser: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long JobUser.id;
    
    @Version
    @Column(name = "version")
    private Integer JobUser.version;
    
    public Long JobUser.getId() {
        return this.id;
    }
    
    public void JobUser.setId(Long id) {
        this.id = id;
    }
    
    public Integer JobUser.getVersion() {
        return this.version;
    }
    
    public void JobUser.setVersion(Integer version) {
        this.version = version;
    }
    
}
