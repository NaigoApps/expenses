package com.naigoapps.expenses.data;

import com.naigoapps.expenses.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributorsRepository extends JpaRepository<Contributor, Long> {

}
