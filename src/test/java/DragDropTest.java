import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.*;
import static com.codeborne.selenide.Selenide.*;

public class DragDropTest {
   @BeforeEach
    void beforeEach() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //sleep(2000);
    }
    @AfterEach
    void afterEach(){
       closeWindow();
    }
    @Test
    void dragDropTest(){
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").hover();
        actions().clickAndHold().moveByOffset(150, 0).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

       // sleep(5000);

    }

    @Test
    void dragDropTest2(){
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDrop(to("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

       // sleep(5000);
    }
}
