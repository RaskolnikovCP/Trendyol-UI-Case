import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

import static org.junit.Assert.assertEquals;

public class SearchTest {
    WebDriver webDriver;
    @Test
    public void shouldSearch() {
        String keyword = "telefon";
        HomePage homePage = new HomePage(webDriver);
        SearchResultPage searchResultPage = homePage.search(keyword);

        String resultText = searchResultPage.getResultText();
        assertEquals(resultText, keyword);
    }

    @org.junit.jupiter.api.Test
    public void shouldDisplayRecommendationsOnSearchBox() {
        String keyword = "telefon";
        HomePage homePage = new HomePage(webDriver);
        homePage.enterSearchKeyword(keyword);

        boolean searchRecommendations = homePage.isSuggestionDisplayed();
        assertEquals(searchRecommendations, true);
    }
}
