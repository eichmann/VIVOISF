package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasMinLongitudeIterator theFacultyPosition = (FacultyPositionHasMinLongitudeIterator)findAncestorWithClass(this, FacultyPositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

