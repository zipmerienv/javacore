package com.kitcenter.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PenaltyTest {
    @Test
    @FileParameters(value = "src/test/resourse/penalty.csv,
            mapper= CsvWithHeaderMapper.class)
    public void penaltyTest(penaltyKick, expResult) {
        Assert.assertEquals(expResult, Penalty.main(penaltyKick, expResult));
    }
}
