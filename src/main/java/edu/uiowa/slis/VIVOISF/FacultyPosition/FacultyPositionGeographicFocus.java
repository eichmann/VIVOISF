package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionGeographicFocusIterator theFacultyPositionGeographicFocusIterator = (FacultyPositionGeographicFocusIterator)findAncestorWithClass(this, FacultyPositionGeographicFocusIterator.class);
			pageContext.getOut().print(theFacultyPositionGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

