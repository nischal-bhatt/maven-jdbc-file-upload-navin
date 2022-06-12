package com.telusko;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
public class FileUpload extends HttpServlet {
	
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		
		List<FileItem> multipleFiles=null;
		try {
			multipleFiles = sf.parseRequest(request);
			System.out.println("in here");
		} catch (FileUploadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for(FileItem item: multipleFiles)
		{
			try {
				System.out.println(item.getName());
				item.write(new File("C:\\Users\\nisch\\Downloads\\WorkSpace\\FileUploadDemo" + item.getName()));
			    System.out.println("written");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("file uploaded");
	}

}
