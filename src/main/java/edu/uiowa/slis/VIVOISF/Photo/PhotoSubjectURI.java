package edu.uiowa.slis.VIVOISF.Photo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PhotoSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PhotoSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PhotoSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Photo thePhoto = (Photo)findAncestorWithClass(this, Photo.class);
			if (!thePhoto.commitNeeded) {
				pageContext.getOut().print(thePhoto.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Photo thePhoto = (Photo)findAncestorWithClass(this, Photo.class);
			return thePhoto.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Photo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Photo thePhoto = (Photo)findAncestorWithClass(this, Photo.class);
			thePhoto.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for subjectURI tag ");
		}
	}
}

