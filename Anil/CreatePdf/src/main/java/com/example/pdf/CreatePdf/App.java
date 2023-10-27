package com.example.pdf.CreatePdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Stream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class App {
	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		
		
		System.out.println("pdf created successfully");
		
	Document document = new Document();
	PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));

	document.open();
	Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
	Chunk chunk = new Chunk("Hello World", font);
	
	
	PdfPTable table = new PdfPTable(3);
	addTableHeader(table);
	
	
	for (int i = 0; i < 4; i++) {
		PdfPCell cell = new PdfPCell(new Phrase("Row " + i + ", Col 0" ));
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Row " + i + ", Col 1"));
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Row " + i + ", Col 2"));
		table.addCell(cell);
	}
	
	
	
//	 to edit individual cell
	 int rowIndexToUpdate = 1;
     int colIndexToUpdate = 1;
     PdfPCell specificCell = table.getRow(rowIndexToUpdate).getCells()[colIndexToUpdate];
     specificCell.setPhrase(new Phrase("Updated Content"));

	try {
		document.add(chunk);
		document.newPage();
		document.add(table);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	document.close();
	
	
}
	
	
	private static void addTableHeader(PdfPTable table) {
		Stream.of("Name", "Address", "Contact").forEach(columnTitle -> {
			PdfPCell header = new PdfPCell();
			header.setBackgroundColor(BaseColor.LIGHT_GRAY);
			header.setBorderWidth(2);
			header.setPhrase(new Phrase(columnTitle));
			table.addCell(header);
		});
	}}

