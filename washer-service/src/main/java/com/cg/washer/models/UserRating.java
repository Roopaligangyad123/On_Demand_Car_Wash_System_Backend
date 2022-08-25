package com.cg.washer.models;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ratingdb")
public class UserRating {
	
	     @NotEmpty(message = "washername must not be empty")
	     private String washername;
	     @NotEmpty(message = "rating must not be empty")
		 private int rating;
	     @NotEmpty(message = "review must not be empty")
		 private String review;
		public UserRating() {
			super();
		}
		public UserRating(  @NotEmpty(message = "washername must not be empty") String washername, 
				 @NotEmpty(message = "rating must not be empty") int rating, 
				 @NotEmpty(message = "review must not be empty") String review) {
			super();
			this.washername = washername;
			this.rating = rating;
			this.review = review;
		}
		public String getWashername() {
			return washername;
		}
		public void setWashername(String washername) {
			this.washername = washername;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getReview() {
			return review;
		}
		public void setReview(String review) {
			this.review = review;
		}
		@Override
		public String toString() {
			return "UserRating [washername=" + washername + ", rating=" + rating + ", review=" + review + "]";
		}
		 
		
}