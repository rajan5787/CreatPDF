import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
public class CreatPDF {
	 public static void main(String[] args)
	   {
	      Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
	         document.open();
	         
	         Paragraph p = new Paragraph();
	         try {
	         p.add("\n");
	         p.add(" Registration Form");
	         p.add("\n =============================================================");
	         
	         p.add("\n Registration Number:      " + "rajan");
	         p.add("\n UHID:                              "+ "sdgh");
	         p.add("\n Legacy UHID:                 " + "dert");
	         p.add("\n First Name :                    " + "sdfgnhjh");
	         p.add("\n Middle Name :                 " + "sdfghjksd");
	        
	         p.add("\n =============================================================");
	         document.add(p);
	         document.close();
	         writer.close();
	         }
	         catch (Exception e) {
	        	    e.printStackTrace();
	        	} 
	      } catch (DocumentException e)
	      {
	    	  System.out.println("sdfdg");
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	    	  System.out.println("sdfdg");
	         e.printStackTrace();
	      }
	   }
}
