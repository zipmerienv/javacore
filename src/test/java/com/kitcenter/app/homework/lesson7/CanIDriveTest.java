package com.kitcenter.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CanIDriveTest {
    @Test
    @FileParameters(value = "src/test/resourse/driveData.csv",
            mapper = CsvWithHeaderMapper.class)

    public void driveTest(int fuelLevel, char expOut) {
        Assert.assertEquals(expOut, CanIDrive.drive(fuelLevel));
    }
}
