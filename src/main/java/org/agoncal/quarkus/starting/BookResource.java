package org.agoncal.quarkus.starting;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

  @Inject
  BookRepository repository;
  @Inject
  Logger logger;

  @GET
  public List<Book> getAllBooks() {
    logger.info("Returns all the books");
    return repository.getAllBooks();
  }

  @GET
  @Path("/count")
  @Produces(MediaType.TEXT_PLAIN)
  public int countAllBooks() {
    logger.info("Returns the number of books");
    return repository.getAllBooks().size();
  }

  @GET
  @Path("{id}")
  public Optional<Book> getBook(@PathParam("id") int id) {
    logger.info("Returns book with id " + id);
    return repository.getBook(id);
  }
}
