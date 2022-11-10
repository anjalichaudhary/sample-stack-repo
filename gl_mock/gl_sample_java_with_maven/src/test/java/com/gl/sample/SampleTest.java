



import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.*;

import org.junit.Test;

// import com.gl.store.pojo.Product;


public class SampleTest {
	File file = new File("./src/main/java/com/gl/sample/controller/ModelController.java");

	@Test
	public void FileExist() throws ClassNotFoundException {
		
			assertEquals("ModelController.java does not exit",file.exists(),true);
	}
	// @Test
	// public void isFieldsPrivate() {
	// 	Field [] fields = Product.class.getFields();
	// 	assertEquals("Product.java should contain the private data members ",fields.length,0);
	// }
// 	@Test
// 	public void getPrivateFields() {
// 		Field [] fields = Product.class.getDeclaredFields();
// //		 for(Field fld1:fields)
// //	        {
// //	            fld1.setAccessible(true);
// //	            System.out.println("field :"+fld1.getName());
// //	            System.out.println("type :"+fld1.getType());
// ////	            System.out.println("value :"+fld1.getInt(new Reflaction1()));
// //	        }
// 		assertEquals("Product.java should contain 6 private data members ",fields.length,0);
		
// 	}
	

}
