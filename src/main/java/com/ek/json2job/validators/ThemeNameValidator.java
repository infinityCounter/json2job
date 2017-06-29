package com.ek.json2job.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;
import com.ek.json2job.Main;

import java.util.ArrayList;

/**
 * Created by Emile Keith on 1/27/17.
 */
public class ThemeNameValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        ArrayList<String> themes = Main.getListOfThemes();

        if (!themes.contains(value)) {
            throw new ParameterException("The theme " + value + " does not exist.");
        }
    }
}
