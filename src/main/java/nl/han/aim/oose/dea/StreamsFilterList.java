package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        // TODO: implement
        Stream<String> stream = input.stream();
        var filteredlist = stream.filter(s -> s.length() < 3);
        return filteredlist.toList();
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        // TODO: implement
        Stream<String> stream = input.stream();
        var filteredlist = stream.filter(s -> check(s));
        return filteredlist.toList();
    }

    private boolean check(String item){
        boolean bool;
        try{
            Integer.parseInt(item);
            bool = true;
        }
        catch(Exception e) {
            bool = false;
        }
        return bool;
    }
}
