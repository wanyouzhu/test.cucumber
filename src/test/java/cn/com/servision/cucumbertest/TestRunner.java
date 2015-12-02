package cn.com.servision.cucumbertest;

import org.junit.runner.RunWith;
import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", snippets = SnippetType.CAMELCASE)
public class TestRunner {
}
