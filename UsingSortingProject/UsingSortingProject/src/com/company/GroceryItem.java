package com.company;

public class GroceryItem {

    private String name;
    private String category;
    private Integer id;

    public GroceryItem(String name, String category) {
        this.name = name;
        this.category = category;
        setId(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId(){
        return id;
    }

    private void setId(String category){
        if(category.equals("fruit")){
            id = 0;
        }else if(category.equals("canned")){
            id = 1;
        }else if(category.equals("dairy")){
            id = 2;
        }else if(category.equals("vegetable")){
            id = 3;
        }else if(category.equals("grain")){
            id = 4;
        }else {
            id = 8;
        }
    }

    public String toString(){
        return name;
    }
}
