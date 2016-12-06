package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionLandAreaYearIterator theFacultyPosition = (FacultyPositionLandAreaYearIterator)findAncestorWithClass(this, FacultyPositionLandAreaYearIterator.class);
			pageContext.getOut().print(theFacultyPosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

