package com.cg.washer.services;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.cg.washer.exception.WasherNotFoundException;
import com.cg.washer.models.DatabaseSequence;
import com.cg.washer.models.Washers;
import com.cg.washer.repository.WasherRepo;

@Service
public class WasherServiceImpl implements WasherService
{
	
	Logger logger = LoggerFactory.getLogger(WasherServiceImpl.class);
	
	@Autowired
	private WasherRepo repo;

	@Override
	public void save(Washers washer) {
		logger.info("Adding Washer");
		repo.save(washer);
		logger.info("Successfully added washer");
	}

	@Override
    public void updateWasherDetails(Washers washer) {
		logger.info("updating washer details"); 
        Optional<Washers> optionalWasher = repo.findById(washer.getId());

        if (optionalWasher == null) {
            throw new WasherNotFoundException("Washer not exising with id: " + washer.getId());
        }

         repo.save(washer);
         logger.info("Successfully updated washer details");
    }

		@Override
	    public void deleteWasher(int id) { 
			logger.info("Deleting Washer");
	        Optional<Washers> optionalWasher = repo.findById(id);

	        if (optionalWasher == null) {
	            throw new WasherNotFoundException("Washer not existing with id: " + id);
	        }
	        Washers washer = optionalWasher.get();
	        repo.delete(washer);
	        logger.info("Successfully deleted washer");
	    } 
		
		@Override
		public Washers viewWasher(int id) {
			logger.info("View washer");
		Optional<Washers> optionalWasher = repo.findById(id);
		if(optionalWasher.isEmpty()) {
		throw new WasherNotFoundException("Washer not existing with id: "+id);
		}
		logger.info("Successfully view washer");
		return optionalWasher.get();


		}
		

	@Override
	public List<Washers> getWashers() {
		logger.info("Getting list of washers");
		return repo.findAll();
	
	}
	@Autowired
    private  MongoOperations mongoOperations;

	 public long getSequenceNumber(String sequenceName) {
	        //get sequence no
	        Query query = new Query(Criteria.where("id").is(sequenceName));
	        //update the sequence no
	        Update update = new Update().inc("seq", 1);
	        //modify in document
	        DatabaseSequence counter = mongoOperations.findAndModify(query,
	                        update, options().returnNew(true).upsert(true),
	                        DatabaseSequence.class);

	        return !Objects.isNull(counter) ? counter.getSeq() : 1;
	    

	 }


}

