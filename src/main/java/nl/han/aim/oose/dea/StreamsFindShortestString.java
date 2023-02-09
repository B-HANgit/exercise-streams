package nl.han.aim.oose.dea;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsFindShortestString {
    String findShortestString(List<String> input) {
        // TODO: implement
//        Stream<String> stream = input.stream();
////        var answer = stream.min(Comparator.comparingInt(String::length));
//
//        Optional<String> answer = stream.min((s, p) -> {return s.length() - p.length();});
//        answer.orElse(null);
//
//        return answer.get();


        return input.stream().min((s,p)-> {return s.length() - p.length();}).orElse(null);
    }
}
