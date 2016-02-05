import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/hello", (request, response) ->
      "<!DOCTYPE html>" +
      "<html>" +
      "<head>" +
        "<title>Hello Friend Letter!</title>" +
        "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
        "<h1>Hello My Dear!</h1>" +
          "<p>Dear Neli,</p>" +
          "<p>How are you feeling? How  is pregnancy treating you?</p>" +
          "<p>I hope you are doing great and are excited that in a few months, you will become a mommy to a sweet little baby boy:)!</p>" +
          "<p>I am writing you this letter to let you know that I am planning to visit Bulgaria in the summer and I can't wait to see my very very best friend. I miss you a lot and can't wait to meet your boys - the  little one and the boy of your dreams and the father for your coming baby.</p>" +
      "</body>" +
      "</html>"
    );


    get("/my-best-friend", (request, response) ->
      "<!DOCTYPE html>" +
      "<html>" +
      "<head>" +
        "<title>Meet my best friend!</title>" +
        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
        "<h1>My best friend, Neli!</h1>" +
          "<p>This is a picture of my best friend,Neli who currently lives in Sofia, Bulgaria with her boyfriend. They are expecting their first child that is due on the same date of my birthday</p>" +
          "<img src='/images/neli.jpg' alt='A photo of my Neli Koleva.'/>" +
      "</body>" +
     "</html>" 

    );
  }
}
