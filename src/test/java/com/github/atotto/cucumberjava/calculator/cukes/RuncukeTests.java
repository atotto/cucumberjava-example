package com.github.atotto.cucumberjava.calculator.cukes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Cucumberテストを実行するためのJUnitテストクラス.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, glue = { "com.github.atotto.cucumberjava.calculator.cukes"})
public class RuncukeTests {
    // 実装しない
}
