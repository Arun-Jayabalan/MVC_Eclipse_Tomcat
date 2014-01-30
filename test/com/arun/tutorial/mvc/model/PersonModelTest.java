package com.arun.tutorial.mvc.model;

import org.junit.*;

public class PersonModelTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        //Assert.assertEquals("Arun", "Arun!");
        PersonModel person = new PersonModel();
        person.setName("Arun");
        person.setMail("a@a.com");
        person.doSomething();

        Assert.assertEquals(person.getName(), "[Arun]");
        Assert.assertEquals(person.getMail(),"[a@a.com]");


    }



}
