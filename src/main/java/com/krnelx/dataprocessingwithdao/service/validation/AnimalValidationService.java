package main.java.com.krnelx.dataprocessingwithdao.service.validation;

import java.util.ArrayList;
import java.util.List;

public class AnimalValidationService {
    private String name;
    private String species;
    private int age;
    private int enclosureId;
    private List<String> errors;

    public AnimalValidationService() {
        this.errors = new ArrayList<>();
    }

    public AnimalValidationService name(String name) {
        this.name = name;
        return this;
    }

    public AnimalValidationService species(String species) {
        this.species = species;
        return this;
    }

    public AnimalValidationService age(int age) {
        this.age = age;
        return this;
    }

    public AnimalValidationService enclosureId(int enclosureId) {
        this.enclosureId = enclosureId;
        return this;
    }

    public List<String> validate() {
        errors.clear();

        validateName();
        validateSpecies();
        validateAge();
        validateEnclosureId();

        return errors;
    }

    private void validateName() {
        if (name == null || name.trim().isEmpty()) {
            errors.add("Name cannot be empty");
        }
    }

    private void validateSpecies() {
        if (species == null || species.trim().isEmpty()) {
            errors.add("Species cannot be empty");
        }
    }

    private void validateAge() {
        if (age <= 0) {
            errors.add("Age must be a positive number");
        }
    }

    private void validateEnclosureId() {
        if (enclosureId <= 0) {
            errors.add("Enclosure ID must be a positive number");
        }
    }
}