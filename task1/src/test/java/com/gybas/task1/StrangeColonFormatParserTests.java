package com.gybas.task1;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
class StrangeColonFormatParserTests {

    private final StrangeColonFormatParser testee = new StrangeColonFormatParser();

    @Test
    void returns_an_empty_map_for_empty_content() {
        assertThat(testee.parse("")).isEmpty();
    }

    @Test
    void parses_a_single_line_without_spaces() {
        //given
        var content = "firstName:Tom";
        var expectedEntry = entry("firstName", "Tom");

        // when
        var parsed = testee.parse(content);

        // then
        assertThat(parsed).containsOnly(expectedEntry);
    }

    @Test
    void parses_a_single_line_with_spaces() {
        //given
        var content = "firstName: Tom";
        var expectedEntry = entry("firstName", "Tom");

        // when
        var parsed = testee.parse(content);

        // then
        assertThat(parsed).containsOnly(expectedEntry);
    }

    @Test
    void aparses_a_single_line_with_spaces() {
        //given
        var content = "firstName: Tom";
        var expectedEntry = entry("firstName", "Tom");

        // when
        var parsed = testee.parse(content);

        // then
        assertThat(parsed).containsOnly(expectedEntry);
    }
}
