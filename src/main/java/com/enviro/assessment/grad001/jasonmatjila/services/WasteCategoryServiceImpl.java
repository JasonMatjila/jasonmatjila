package com.enviro.assessment.grad001.jasonmatjila.services;

import com.enviro.assessment.grad001.jasonmatjila.models.WasteCategory;
import com.enviro.assessment.grad001.jasonmatjila.persistence.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryServiceImpl implements WasteCategoryService {

    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    @Override
    public WasteCategory saveWasteCategory(WasteCategory wasteCategory) {
        return wasteCategoryRepository.save(wasteCategory);
    }

    @Override
    public WasteCategory updateWasteCategory(Long id, WasteCategory wasteCategory) {
        WasteCategory existingCategory = wasteCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Waste category not found with id: " + id));
        existingCategory.setName(wasteCategory.getName());
        existingCategory.setDescription(wasteCategory.getDescription());
        return wasteCategoryRepository.save(existingCategory);
    }

    @Override
    public void deleteWasteCategory(Long id) {
        wasteCategoryRepository.deleteById(id);
    }

    @Override
    public WasteCategory getWasteCategoryById(Long id) {
        return wasteCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Waste category not found with id: " + id));
    }

    @Override
    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryRepository.findAll();
    }
}
