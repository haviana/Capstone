package com.gybas.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrangeColonFormatParserTests {

    private StrangeColonFormatParser testee = new StrangeColonFormatParser();

    @Test
    void returnEmptyMapForEmptyInput() {
        assertThat(testee.parse("")).isEmpty();
    }
}


