@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Пользователь с возрастом 19 лет совершеннолетний", true, isAdult);
}