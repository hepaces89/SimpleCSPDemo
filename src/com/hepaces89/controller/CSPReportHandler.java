package com.hepaces89.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CSPReportHandler extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
//		Map<String, String[]> requestParameterMap = request.getParameterMap();
//		for(Map.Entry<String, String[]> entry: requestParameterMap.entrySet()){
//			System.out.println(entry.getKey().toString());
//		}
		BufferedReader reader = request.getReader();
		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
		}
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		try {
			response.getOutputStream().print("Post to this URL to process the CSP reporting");
			response.getOutputStream().flush();
			response.getOutputStream().close();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
