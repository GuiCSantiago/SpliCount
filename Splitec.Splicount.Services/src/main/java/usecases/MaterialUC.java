package usecases;

import splitec.splicount.entities.Material;
import repository.MaterialRepository;

public class MaterialUC {
    private MaterialRepository _materialRepository;

    public Material ConsultarMaterial() {
        return _materialRepository.Get();
    }
}
