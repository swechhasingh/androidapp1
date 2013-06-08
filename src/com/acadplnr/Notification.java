package com.acadplnr;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;

public class Notification extends Activity{
	String url="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);

		String html = "";
		InputStream in = response.getEntity().getContent();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuilder str = new StringBuilder();
		String line = null;
		while((line = reader.readLine()) != null)
		{
		    str.append(line);
		}
		in.close();
		html = str.toString();
	}  
}
