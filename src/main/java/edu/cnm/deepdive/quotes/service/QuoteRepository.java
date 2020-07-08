package edu.cnm.deepdive.quotes.service;

import edu.cnm.deepdive.quotes.model.entity.Quote;
import edu.cnm.deepdive.quotes.model.entity.Source;
import edu.cnm.deepdive.quotes.model.entity.Tag;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

  Iterable<Quote> getAllByOrderByTextAsc();

  Iterable<Quote> getAllBySourceOrderByTextAsc(Source source);

  Iterable<Quote> getAllByTagsContainingOrderByTextAsc(Tag tag);

  Iterable<Quote> getAllByTextContainsOrderByTextAsc(String filter);

  Iterable<Quote> getAllByCreatedBetweenOrderByCreatedAsc(Date start, Date end);
}
