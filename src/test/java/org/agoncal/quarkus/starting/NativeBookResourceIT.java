package org.agoncal.quarkus.starting;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@NativeImageTest
public class NativeBookResourceIT extends BookResourceTest {

    // Execute the same tests but in native mode.

  @Test
  public void shouldGetABook() {
    given()
      .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
      .pathParam("id", 1).
      when()
      .get("/api/books/{id}").
      then()
      .statusCode(Response.Status.OK.getStatusCode())
      .body("title", is("Understanding Quarkus"))
      .body("author", is("Antonio"))
      .body("yearOfPublication", is(2020))
      .body("genre", is("Information Technology"));
  }
}
