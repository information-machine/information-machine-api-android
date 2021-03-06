/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class CategoryInfoBuilder {
    //the instance to build
    private CategoryInfo categoryInfo;

    /**
     * Default constructor to initialize the instance
     */
    public CategoryInfoBuilder() {
        categoryInfo = new CategoryInfo();
    }

    public CategoryInfoBuilder grocery(Boolean grocery) {
        categoryInfo.setGrocery(grocery);
        return this;
    }

    public CategoryInfoBuilder id(Integer id) {
        categoryInfo.setId(id);
        return this;
    }

    public CategoryInfoBuilder name(String name) {
        categoryInfo.setName(name);
        return this;
    }

    public CategoryInfoBuilder parentId(Integer parentId) {
        categoryInfo.setParentId(parentId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CategoryInfo build() {
        return categoryInfo;
    }
}