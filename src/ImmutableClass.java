import java.util.List;

public final class ImmutableClass {

    private final String name;
    private final int id;
    private final List<String> list;

 public ImmutableClass(String name, int id, List<String> list) {
        this.name=name;
        this.id=id;
        this.list=list;
    }
    public String getString(){
    return name;
    }

    public int getId(){
        return id;
    }

    public List<String> getList() {
        return list;
    }
}
