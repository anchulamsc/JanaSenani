package com.sena.dms.spring.dao;

import com.sena.dms.spring.model.entity.ImageDetails;

public interface GalleriesDAO {

	public void saveFile(ImageDetails galleryDetails);

	public ImageDetails getFileById(String user_id, String file_id);

	public void deleteFileById(String user_id, String file_id);

}
