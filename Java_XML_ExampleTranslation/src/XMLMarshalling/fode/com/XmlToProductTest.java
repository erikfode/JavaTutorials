package XMLMarshalling.fode.com;


import org.junit.Test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;


public class XmlToProductTest {
    private Product product;
    
    @Test
    public void testXmlToObject() throws JAXBException, FileNotFoundException {
        File file = new File("product.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        product = (Product) unmarshaller.unmarshal(file);
        System.out.println(product);
    }
    
}
