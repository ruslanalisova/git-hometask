import java.util.List;
import java.util.stream.Collectors;

public class textFilter {

    public static void main(String[] args) {
        List<String> textValues = List.of("V's background and identity are never revealed. He is at one point an inmate at \"Larkhill Resettlement Camp\"—one of many concentration camps where black people, Jews, leftists, beatniks, homosexuals and Ethnic Irish are exterminated by Norsefire, a fascist dictatorship that rules Britain. While there, he is part of a group of prisoners who are subjected to horrific medical experimentation, conducted by Dr. Delia Surridge. Lewis Prothero is the camp's commandant, while Father Anthony Lilliman, a paedophile vicar, is at the camp to lend \"spiritual support\". All prisoners who are part of the experiment die, with the sole exception of \"the man in room five\" (\"V\" in Roman numerals). As a result of the experiments, the man develops Olympic-level physical abilities and an incredibly expanded intellect. During that time, the man had some level of communication with Valerie Page, a former actress imprisoned for being a lesbian, kept in \"room four\", who wrote her autobiography on toilet paper and then pushed it through a hole in the wall.".split(" "));

        List<String> textWithO = textValues.stream().filter(textValue -> textValue.startsWith("O") || textValue.startsWith("o")).distinct().collect(Collectors.toList());

        System.out.println(textWithO);
    }
}

