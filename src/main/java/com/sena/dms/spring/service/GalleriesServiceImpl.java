package com.sena.dms.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sena.dms.spring.dao.GalleriesDAO;
import com.sena.dms.spring.model.entity.ImageDetails;
import com.sena.dms.spring.util.DateUtil;

@Service
public class GalleriesServiceImpl implements GalleriesService {
	private static final Logger logger = LoggerFactory.getLogger(GalleriesServiceImpl.class);

	private GalleriesDAO galleriesDAO;

	@Autowired(required = true)
	@Qualifier(value = "galleriesDAO")
	public void setGalleriesDAO(GalleriesDAO galleriesDAO) {
		this.galleriesDAO = galleriesDAO;
	}

	public void saveFile(ImageDetails galleryDetails) {

		galleryDetails.setInserted_timestamp(DateUtil.getCurrentTime());
		galleryDetails.setUpdated_timestamp(DateUtil.getCurrentTime());
		galleryDetails.setSequence_num("999");
		galleriesDAO.saveFile(galleryDetails);

	}

	public ImageDetails getFileById(String user_id, String file_id) {
		return galleriesDAO.getFileById(user_id, file_id);
	}

	public void deleteFileById(String user_id, String file_id) {
		// TODO Auto-generated method stub

	}

}
