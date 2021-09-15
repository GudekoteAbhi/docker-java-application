package com.example.helloworld.Repository;

import com.example.helloworld.Model.Employee;
import com.example.helloworld.Model.OrganizationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationInfoJpaRepository extends JpaRepository<OrganizationInfo,String> {

    public OrganizationInfo findByContact(String contact);
}
