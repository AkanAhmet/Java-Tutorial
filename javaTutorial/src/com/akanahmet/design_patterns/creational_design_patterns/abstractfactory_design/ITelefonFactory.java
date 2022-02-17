package com.akanahmet.design_patterns.creational_design_patterns.abstractfactory_design;



public interface ITelefonFactory {
    ITelefon getTelefon(String model, String batarya, int en, int boy);
}
