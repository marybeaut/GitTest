package com.tasmc.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tasmc.util.test.Addition_Test;
import com.tasmc.util.test.Multiply_Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({Addition_Test.class,Multiply_Test.class})

public class AllTests {

}
