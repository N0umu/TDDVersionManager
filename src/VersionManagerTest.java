import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionManagerTest {

    private final VersionManager version = new VersionManager();

    @Test
    void patch(){
        version.patch();
        assertEquals(1, version.getVersion());
    }
    @Test
    void minor(){
        version.minor();
        assertEquals(10,version.getVersion());
    }
    @Test
    void major(){
        version.major();
        assertEquals(100, version.getVersion());
    }
    @Test
    void getVersion(){
        assertEquals(0,version.getVersion());
    }
    @Test
    void setVersion(){
        version.setVersion(111);
        assertEquals(111, version.getVersion());
    }

    @Test
    void patchMinorMajor(){
        version.patch();
        version.minor();
        version.major();
        assertEquals(111, version.getVersion());
    }
}