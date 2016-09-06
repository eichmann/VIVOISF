package edu.uiowa.slis.VIVOISF.Photo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PhotoLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PhotoLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PhotoLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Photo thePhoto = (Photo)findAncestorWithClass(this, Photo.class);
			if (!thePhoto.commitNeeded) {
				pageContext.getOut().print(thePhoto.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Photo thePhoto = (Photo)findAncestorWithClass(this, Photo.class);
			return thePhoto.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Photo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Photo thePhoto = (Photo)findAncestorWithClass(this, Photo.class);
			thePhoto.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for label tag ");
		}
	}
}

