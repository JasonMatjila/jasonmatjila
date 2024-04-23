package com.enviro.assessment.grad001.jasonmatjila.controllers;
import com.enviro.assessment.grad001.jasonmatjila.models.WasteCategory;
import com.enviro.assessment.grad001.jasonmatjila.services.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryService wasteCategoryService;

    @PostMapping
    public WasteCategory createWasteCategory(@RequestBody WasteCategory wasteCategory) {
        return wasteCategoryService.saveWasteCategory(wasteCategory);
    }

    @PutMapping("/{id}")
    public WasteCategory updateWasteCategory(@PathVariable Long id, @RequestBody WasteCategory wasteCategory) {
        return wasteCategoryService.updateWasteCategory(id, wasteCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteWasteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteWasteCategory(id);
    }

    @GetMapping("/{id}")
    public WasteCategory getWasteCategoryById(@PathVariable Long id) {
        return wasteCategoryService.getWasteCategoryById(id);
    }

    @GetMapping
    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryService.getAllWasteCategories();
    }
    
}
