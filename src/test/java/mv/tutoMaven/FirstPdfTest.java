package mv.tutoMaven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.itextpdf.text.Document;

public class FirstPdfTest {

	//Partie 4 : Couverture des tests
	//Comment écrire des lignes de tests ?//
	
	@Test
	public void test() {
		assertTrue(true);
	}
}
/**
public void test() {
	Document doc = new Document();
	FirstPDF.addMetaData(doc);
	Document doc2 = new Document();
	doc2.addTitle("My first PDF");
    doc2.addSubject("Using iText");
    doc2.addKeywords("Java, PDF, iText");
    doc2.addAuthor("Olivier Barais");
    doc2.addCreator("Olivier Barais");
	assertEquals(doc2,doc);
}*/