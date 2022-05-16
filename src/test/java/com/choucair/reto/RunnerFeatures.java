package com.choucair.reto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Serenity/Forms/", tags = {"@NewMeeting"})
public class RunnerFeatures {

}
