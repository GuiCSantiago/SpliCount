package repository;

import splitec.splicount.entities.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialRepository {

    private final List<Material> _inMemoryDb = new ArrayList<>();

    public MaterialRepository() {
        _inMemoryDb.add(new Material(1000));
    }

    public Material Get() {
        return _inMemoryDb.get(1);
    }
}
