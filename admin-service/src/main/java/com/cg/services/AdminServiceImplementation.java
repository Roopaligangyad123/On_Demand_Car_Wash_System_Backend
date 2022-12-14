package com.cg.services;



import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.AdminNotFoundException;
import com.cg.exception.WashpackNotFoundException;
import com.cg.models.Admin;
import com.cg.models.UserRating;
import com.cg.models.Washpack;
import com.cg.repository.AdminRepo;
import com.cg.repository.RatingRepo;
import com.cg.repository.WashRepo;


@Service
public class AdminServiceImplementation implements AdminService {
	
	Logger logger = LoggerFactory.getLogger(AdminServiceImplementation.class);
	
	@Autowired
	private AdminRepo adminrepo;
	@Autowired
	private RatingRepo ratingrepo;
	@Autowired
	private WashRepo washrepo;

	@Override
	public List<Admin> findAll() {
		logger.info("Getting Admin list");
		List<Admin> admin=adminrepo.findAll();
		logger.info(" Successfull search of all admins");
		return admin;
	}

	@Override
	public void saveAdmin(Admin admin) {
		logger.info("Adding Admins");
		adminrepo.save(admin);
		logger.info("Admin added Successfully");

	}

	@Override
	public void updateAdmin(Admin admin) {
		logger.info("Updating Admin");
		Optional<Admin> optionalAdmin = adminrepo.findById(admin.getId());

		if (optionalAdmin == null) {
			throw new AdminNotFoundException("Admin not exising with id: " + admin.getId());
		}
		adminrepo.save(admin);
		logger.info("Admin Updated Successfully");
	}

	@Override
	public void deleteAdmin(int id) {
		logger.info("Deleting admin by id");
		
		Optional<Admin> optionalAdmin = adminrepo.findById(id);

		if (optionalAdmin == null) {
			throw new AdminNotFoundException("Admin not exising with id: " + id);
		}

		Admin student = optionalAdmin.get();

		adminrepo.delete(student);
		logger.info("Admin Deleted Successfully");

	}


	@Override
	public List<Washpack> getWashpack() {
		logger.info("Getting List of washpacks");
		List<Washpack> washpack=washrepo.findAll();
		logger.info("Successfully got List of washpacks");
		return washpack;
	}

	@Override
	public void saveWashpack(Washpack washpacks) 
	{
		logger.info("Adding Washpack");
		washrepo.save(washpacks);
		logger.info("Successfully added washpacks");

	}

	@Override
	public void updateWashpack(Washpack updatepack) {
		Optional<Washpack> optionalWashpack = washrepo.findById(updatepack.getId());
		logger.info("Updating Washpack");
		if (optionalWashpack == null) {
			throw new WashpackNotFoundException("Washpack not exising with id: " + updatepack.getId());
		}

		 washrepo.save(updatepack);
		 logger.info("Successfully updated Washpack");
	}

	@Override
	public void deleteWashpack(int id) {
		logger.info("Deleting the washpack by id");
		Optional<Washpack> optionalWashpack = washrepo.findById(id);

		if (optionalWashpack == null) {
			throw new WashpackNotFoundException("Washpack not exising with id: " + id);
		}

		Washpack wash = optionalWashpack.get();

		washrepo.delete(wash);
		logger.info("Successfully deleted washpack");

	}

	@Override
	public List<UserRating> getUser() {
		logger.info("Getting list of userratings");
		List<UserRating> rating=ratingrepo.findAll();
		logger.info(" Successfully got list of ratings");
		return rating;
	}

	

}
