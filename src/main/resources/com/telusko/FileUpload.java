package com.telusko;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
public class FileUpload extends HttpServlet {
	
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		
		List<FileItem> multipleFiles = sf.parseRequest(request);
		
		for(FileItem item: multipleFlies)
		{
			item.write(new File("C:\\Users\\nisch\\Downloads\\WorkSpace" + item.getName()));
			
		}
		
		System.out.println("file uploaded");
	}

}
