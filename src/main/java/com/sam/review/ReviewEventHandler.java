package com.sam.review;

import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler(Review.class)
public class ReviewEventHandler {
}
