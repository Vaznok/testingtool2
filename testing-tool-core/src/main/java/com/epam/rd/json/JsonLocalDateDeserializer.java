package com.epam.rd.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class JsonLocalDateDeserializer extends JsonDeserializer<LocalDate> {
    private static final long serialVersionUID = 1L;
    private static final String datePattern = "yyyy-MM-dd";
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);

    @Override
    public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = jp.getCodec();
        TextNode node = oc.readTree(jp);
        try {
            return LocalDate.parse(node.textValue(), formatter);
        } catch (DateTimeParseException ex) {
           throw new IllegalArgumentException();
        }
    }
}
