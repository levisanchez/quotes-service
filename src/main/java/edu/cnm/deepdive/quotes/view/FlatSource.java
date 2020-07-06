package edu.cnm.deepdive.quotes.view;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Date;
import org.springframework.lang.NonNull;

@JsonPropertyOrder({"id", "created", "updated", "name"})
public interface FlatSource {

  Long getId() ;

  @NonNull
  String getName();

  Date getCreated();

  Date getUpdated();


}

