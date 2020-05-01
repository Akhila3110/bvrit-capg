package com.capg.pbms.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.pbms.accountmanagement.model.AccountManagement;

@Repository
public interface IAccountManagementRepo extends JpaRepository<AccountManagement, Long> {

}
