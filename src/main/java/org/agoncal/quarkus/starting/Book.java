package org.agoncal.quarkus.starting;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class Book {

  public int id;
  public String title;
  public String author;
  public int yearOfPublication;
  public String genre;

  // Constructor

  public Book(int id, String title, String author, int yearOfPublication, String genre) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.yearOfPublication = yearOfPublication;
    this.genre = genre;
  }
}
