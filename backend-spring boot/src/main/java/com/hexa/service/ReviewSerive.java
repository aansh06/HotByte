package com.hexa.service;

import java.util.List;

import com.hexa.Exception.ReviewException;
import com.hexa.model.Review;
import com.hexa.model.User;
import com.hexa.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
