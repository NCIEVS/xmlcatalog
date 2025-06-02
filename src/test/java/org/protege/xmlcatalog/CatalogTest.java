package org.protege.xmlcatalog;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

//import org.apache.log4j.Logger;

public class CatalogTest extends TestCase {
    private static final Logger log = LoggerFactory.getLogger(CatalogTest.class);

    public void testExample1() {
        try {
            CatalogUtilities.parseDocument(new File("src/test/resources/Example1.xml").toURI().toURL());
        }
        catch (Throwable t) {
            log.warn("Test failed", t);
            fail();
        }
    }
    
    public void testExample2() {
        try {
            CatalogUtilities.parseDocument(new File("src/test/resources/Example2.xml").toURI().toURL());
        }
        catch (Throwable t) {
            log.warn("Test failed", t);
            fail();
        }
    }
    
    public void testCatalog8() {
        try {
            CatalogUtilities.parseDocument(new File("src/test/resources/catalog08.xml").toURI().toURL());
        }
        catch (Throwable t) {
            log.warn("Test failed", t);
            fail();
        }
    }
}
