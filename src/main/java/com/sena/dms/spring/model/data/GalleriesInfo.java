package com.sena.dms.spring.model.data;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class GalleriesInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
