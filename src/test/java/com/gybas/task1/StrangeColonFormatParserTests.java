package com.gybas.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrangeColonFormatParserTests {

    private StrangeColonFormatParser testee = new StrangeColonFormatParser();

    @Test
    public void returnEmptyMapForEmptyInput() {
        assertThat(testee.parse("")).isEmpty();
    }
}


