public class VersionManager {

    private int version = 0;
    public void patch(){
        this.version ++;
    }

    public void minor(){
        this.version += 10;
    }

    public void major(){
        this.version += 100;
    }

    public int getVersion(){
        return this.version;
    }

    public void setVersion(int version){
        this.version = version;
    }
}
