package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			if (!thePostdocPosition.commitNeeded) {
				pageContext.getOut().print(thePostdocPosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			return thePostdocPosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			thePostdocPosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for placeOfPublication tag ");
		}
	}
}

