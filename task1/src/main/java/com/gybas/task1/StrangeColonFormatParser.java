package com.gybas.task1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class StrangeColonFormatParser {

    Map<String, String> parse(String content) {

        Map<String,String> mappedInfo = new HashMap<>();

        if (content.isEmpty()){
            return Collections.emptyMap();
        }

        String[] parsedContent = content.replace(" ","").split(":");


        mappedInfo.put(parsedContent[0],parsedContent[1]);

        return mappedInfo;
    }
}
