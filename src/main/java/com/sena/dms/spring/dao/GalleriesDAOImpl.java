package com.sena.dms.spring.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sena.dms.spring.model.entity.ImageDetails;
import com.sena.dms.spring.model.entity.UserRoles;

@Repository
public class GalleriesDAOImpl implements GalleriesDAO {
	private static final Logger logger = LoggerFactory.getLogger(GalleriesDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public Session openSession() {
		return this.sessionFactory.openSession();
	}

	public void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

	public void saveFile(ImageDetails galleryDetails) {
		Session session = null;
		try {
			session = openSession();
			session.merge(galleryDetails);
			session.flush();
		} finally {
			closeSession(session);
		}
	}

	public ImageDetails getFileById(String user_id, String file_id) {
		Session session = null;
		ImageDetails galleryDetails = null;
		try {
			session = openSession();
			String galleryQueryString = "from GalleryDetails where user_id = :user_id and file_id = :file_id";
			Query galleryQuery = session.createQuery(galleryQueryString);
			galleryQuery.setString("user_id", user_id);
			galleryQuery.setString("file_id", file_id);
			Object galleryQueryResult = galleryQuery.uniqueResult();
			galleryDetails = (ImageDetails) galleryQueryResult;
		} finally {
			closeSession(session);
		}
		return galleryDetails;
	}

	public void deleteFileById(String user_id, String file_id) {
		// TODO Auto-generated method stub

	}

}
