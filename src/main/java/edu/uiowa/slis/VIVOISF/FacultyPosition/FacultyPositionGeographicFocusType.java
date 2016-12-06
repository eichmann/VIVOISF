package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionGeographicFocusIterator theFacultyPositionGeographicFocusIterator = (FacultyPositionGeographicFocusIterator)findAncestorWithClass(this, FacultyPositionGeographicFocusIterator.class);
			pageContext.getOut().print(theFacultyPositionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

