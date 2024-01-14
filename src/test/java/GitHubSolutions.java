import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSolutions {
    @Test
    void solutionsEnerpriseTest(){
        open("https://github.com");
        $("[aria-label='Global']").$$("ul li").findBy(text("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("html").shouldHave(text("To build, scale, and deliver secure software."));

//        sleep(5000);
    }

}
