package pages;

import businessObjects.LoginActions;
import configuration.BaseTest;

public class PageExpressions extends BaseTest
{
    public static LoginActions loginPage =new LoginActions(getInstance());
    public static HomePage homePage =new HomePage(getInstance());
    public static FriendsPage friendsPage =new FriendsPage(getInstance());
    public static GeneralPage generalPage =new GeneralPage(getInstance());
    public static GamingPage gamingPage =new GamingPage(getInstance());
    public static AccountMenu accountMenu =new AccountMenu(getInstance());

}
