package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasMaxLongitudeIterator theFacultyPosition = (FacultyPositionHasMaxLongitudeIterator)findAncestorWithClass(this, FacultyPositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

