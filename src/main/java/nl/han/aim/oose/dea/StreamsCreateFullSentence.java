package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCreateFullSentence {
    String createAFullSentenceFromTheList(List<String> input) {
        // TODO: implement
        return input.stream()
                .collect(Collectors.joining(" "));
    }
}
