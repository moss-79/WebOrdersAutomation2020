package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * it meant to be extended
 */
public abstract class AbstractBasePage {


    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
