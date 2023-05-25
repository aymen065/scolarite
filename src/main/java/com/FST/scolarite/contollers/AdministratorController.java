package com.FST.scolarite.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.FST.scolarite.entities.Administrator;
import com.FST.scolarite.services.AdministratorService;

import java.util.List;

@RestController
@RequestMapping("/administrators")
public class AdministratorController {
	private final AdministratorService administratorService;

	@Autowired
	public AdministratorController(AdministratorService administratorService) {
		this.administratorService = administratorService;
	}

	@GetMapping
	public List<Administrator> getAllAdministrators() {
		return administratorService.getAllAdministrators();
	}

	@GetMapping("/{id}")
	public Administrator getAdministratorById(@PathVariable Long id) {
		return administratorService.getAdministratorById(id);
	}

	@PostMapping
	public Administrator createAdministrator(@RequestBody Administrator administrator) {
		return administratorService.createAdministrator(administrator);
	}

	@PutMapping("/{id}")
	public Administrator updateAdministrator(@PathVariable Long id, @RequestBody Administrator administratorDetails) {
		return administratorService.updateAdministrator(id, administratorDetails);
	}

	@DeleteMapping("/{id}")
	public void deleteAdministrator(@PathVariable Long id) {
		administratorService.deleteAdministrator(id);
	}
}
