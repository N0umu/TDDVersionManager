import static org.junit.jupiter.api.Assertions.assertEquals;

import example.util.Calculator;

import org.junit.jupiter.api.Test;

public class VersionManagerTest{

    private final VersionManager version = new VersionManager();

    @Test
    void patch(){
        assertEquals(1,version.patch();)
    }
    @Test
    void minor(){
        assertEquals(10,version.minor();)
    }
    @Test
    void major(){
        assertEquals(100,version.major();)
    }
    @Test
    void getVersion(){

    }
    @Test
    void setVersion(){

    }
}
