package com.FST.scolarite.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FST.scolarite.entities.Administrator;
import com.FST.scolarite.repositories.AdministratorRepository;
import com.FST.scolarite.services.AdministratorService;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    private final AdministratorRepository administratorRepository;
    
    @Autowired
    public AdministratorServiceImpl(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }
    
    @Override
    public List<Administrator> getAllAdministrators() {
        return administratorRepository.findAll();
    }
    
    @Override
    public Administrator getAdministratorById(Long id) {
        return administratorRepository.findById(id).orElse(null);
    }
    
    @Override
    public Administrator createAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
    }
    
    @Override
    public Administrator updateAdministrator(Long id, Administrator administratorDetails) {
        Administrator administrator = administratorRepository.findById(id).orElse(null);
        if (administrator != null) {
            administrator.setName(administratorDetails.getName());
            administrator.setRole(administratorDetails.getRole());
            return administratorRepository.save(administrator);
        }
        return null;
    }
    
    @Override
    public void deleteAdministrator(Long id) {
        administratorRepository.deleteById(id);
    }
}
