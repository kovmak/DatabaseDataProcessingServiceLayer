package main.java.com.krnelx.dataprocessingwithdao.service.validation;

import java.util.ArrayList;
import java.util.List;

public class EnclosureValidationService {

    private String name;
    private String type;
    private int capacity;
    private List<String> errors;

    public EnclosureValidationService() {
        this.errors = new ArrayList<>();
    }

    public EnclosureValidationService name(String name) {
        this.name = name;
        return this;
    }

    public EnclosureValidationService type(String type) {
        this.type = type;
        return this;
    }

    public EnclosureValidationService capacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public List<String> validate() {
        errors.clear();

        validateName();
        validateType();
        validateCapacity();

        return errors;
    }

    private void validateName() {
        if (name == null || name.trim().isEmpty()) {
            errors.add("Name cannot be empty");
        }
    }

    private void validateType() {
        if (type == null || type.trim().isEmpty()) {
            errors.add("Type cannot be empty");
        }
    }

    private void validateCapacity() {
        if (capacity <= 0) {
            errors.add("Capacity must be a positive number");
        }
    }
}