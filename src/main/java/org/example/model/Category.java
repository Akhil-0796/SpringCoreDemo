package org.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Category {
    private int categoryId;
    private String categoryType;
}
