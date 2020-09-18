package com.fabriceci.fmc.model;

import java.util.ArrayList;

public class RightFolder {
	
	//{folder:[{"folder_name":",writable:"1","readable":"1"},{"folder_name":",writable:"1","readable":"1"}]}
	
	ArrayList<OneRightFolder> folder = new ArrayList<OneRightFolder>();

	public ArrayList<OneRightFolder> getFolder() {
		return folder;
	}

	public void setFolder(ArrayList<OneRightFolder> folder) {
		this.folder = folder;
	}
	

}