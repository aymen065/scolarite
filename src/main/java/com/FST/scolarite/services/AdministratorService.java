package com.FST.scolarite.services;

import java.util.List;

import com.FST.scolarite.entities.Administrator;

public interface AdministratorService {
	List<Administrator> getAllAdministrators();

	Administrator getAdministratorById(Long id);

	Administrator createAdministrator(Administrator administrator);

	Administrator updateAdministrator(Long id, Administrator administratorDetails);

	void deleteAdministrator(Long id);
}
