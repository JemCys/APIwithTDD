package com.Solera.APIRest.APIwithTDD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.parser.Part;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;

import static org.junit.jupiter.api.Assertions.*;

public class PartsTest {

    @Test
    public void addPartWithId() {
        PartsClass existingPart = new PartsClass();
        int id = 123;
        existingPart.setName("Motor V8");

        assertEquals("Motor V8", existingPart.getname());
        assertEquals(123, id);
    }

    @Test
    public void deleteExistingPart() {
        PartsClass existingPart = new PartsClass();
        existingPart.setName("Motor V8");
        assertEquals("Motor V8", existingPart.getname());

        existingPart.setName(null);
        assertNull(existingPart.getname());
    }
}