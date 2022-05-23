package java8.PredicatesAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Response {

    String responseBody;
    int statusCode;
    String responseType;


    public Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responseBody='" + responseBody + '\'' +
                ", statusCode=" + statusCode +
                ", responseType='" + responseType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Response> responseList = new ArrayList<>();
        responseList.add(new Response("Test JSON Body", 200, "JSON"));
        responseList.add(new Response("Test XML Body", 200, "XML"));
        responseList.add(new Response("Test JSON Body", 201, "JSON"));
        responseList.add(new Response("Test XML Body", 201, "XML"));
        responseList.add(new Response("null", 400, "JSON"));
        responseList.add(new Response("null", 400, "XML"));
        responseList.add(new Response("null", 404, "JSON"));
        responseList.add(new Response("null", 404, "XML"));

        Predicate<Response> statusCode400Predicate = a -> a.statusCode == 400;
        Predicate<Response> responseTypeJsonPredicate = a -> a.responseType.equals("JSON");

        System.out.println("All responses with status code 400");
        responseList.stream().filter(statusCode400Predicate).forEach(System.out::println);

        System.out.println("All responses with response type JSON");
        responseList.stream().filter(responseTypeJsonPredicate).forEach(System.out::println);

        System.out.println("All responses with status code 400 AND response type JSON");
        responseList.stream().filter(statusCode400Predicate.and(responseTypeJsonPredicate)).forEach(System.out::println);

        System.out.println("All responses with status code 400 OR response type JSON");
        responseList.stream().filter(statusCode400Predicate.or(responseTypeJsonPredicate)).forEach(System.out::println);

        System.out.println("All responses with status code not 400 AND response type JSON");
        responseList.stream().filter(statusCode400Predicate.negate().and(responseTypeJsonPredicate)).forEach(System.out::println);


    }
}
