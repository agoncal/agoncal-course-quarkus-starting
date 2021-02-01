package org.agoncal.quarkus.starting;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@ApplicationScoped
public class BookRepository {

  @ConfigProperty(name = "books.genre")
  String genre;

  public List<Book> getAllBooks() {
    return List.of(new Book(1, "Understanding Quarkus", "Antonio", 2020, genre),
      new Book(2, "Practising Quarkus", "Antonio", 2020, genre),
      new Book(3, "Effective Java", "Josh Bloch", 2001, genre),
      new Book(4, "Thinking in Java", "Bruce Eckel", 1998, genre));
  }

  public Optional<Book> getBook(int id) {
    return getAllBooks().stream().filter(book -> book.id == id).findFirst();
  }
}
