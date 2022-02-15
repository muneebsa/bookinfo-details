package com.example.bookinfo.details.repository;

import com.example.bookinfo.details.model.Details;
import org.springframework.stereotype.Component;

@Component
public class DetailsRepository {
    public Details findById(int id) {
        Details details = new Details();
        details.setId(id);
        details.setAuthor("William Shakespeare");
        details.setYear(1595);
        details.setType("paperback");
        details.setPages(200);
        details.setPublisher("PublisherA");
        details.setLanguage("English");
        details.setIsbn10("1234567890");
        details.setIsbn13("123-1234567890");
        return details;
    }

}
