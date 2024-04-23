package com.enviro.assessment.grad001.jasonmatjila.services;
import com.enviro.assessment.grad001.jasonmatjila.models.WasteCategory;
import java.util.List;

public interface WasteCategoryService {
    public WasteCategory saveWasteCategory(WasteCategory wasteCategory);
    public WasteCategory updateWasteCategory(Long id, WasteCategory wasteCategory);
    public void deleteWasteCategory(Long id);
    public WasteCategory getWasteCategoryById(Long id);
    public List<WasteCategory> getAllWasteCategories();
}
