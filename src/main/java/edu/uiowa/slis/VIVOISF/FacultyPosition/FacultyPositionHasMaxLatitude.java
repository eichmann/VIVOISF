package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasMaxLatitudeIterator theFacultyPosition = (FacultyPositionHasMaxLatitudeIterator)findAncestorWithClass(this, FacultyPositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

