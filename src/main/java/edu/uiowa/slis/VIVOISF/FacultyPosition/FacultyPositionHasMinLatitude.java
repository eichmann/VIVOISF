package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasMinLatitudeIterator theFacultyPosition = (FacultyPositionHasMinLatitudeIterator)findAncestorWithClass(this, FacultyPositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

