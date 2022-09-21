package serializer;

import classes.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CustomSerializerTest {

    private Cat cat;
    private String testJsonString;

    @BeforeEach
    void setUp() {
        cat = new Cat();
        cat.setName("blackO");
        cat.setAge(10);
        cat.setColour("black");
        testJsonString = "{\"name\":\"blackO\",\"age\":10,\"colour\":\"black\",\"dateOfBirth\":null}";
    }

    @Test
    void testWriteCatToJson() {
        String catAsJson =
                CustomSerializer.catToJson(cat);
        assertEquals(testJsonString, catAsJson);
    }

    @Test
    void testWriteJsonToCat() {
        Cat catDeserializeFromJsonString =
                CustomSerializer.jsonToCat(testJsonString);
        assertNotNull(catDeserializeFromJsonString);
        assertEquals(cat, catDeserializeFromJsonString);
        assertEquals("blackO", catDeserializeFromJsonString.getName());
    }

    @Test
    void testSerializeCatWithADateOfBirth(){
        cat.setDateOfBirth(LocalDateTime.now());
        String catInJson = CustomSerializer.catToJson(cat);
        assertNotNull(catInJson);
    }
}