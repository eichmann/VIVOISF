package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHrJobTitleIterator theFacultyPosition = (FacultyPositionHrJobTitleIterator)findAncestorWithClass(this, FacultyPositionHrJobTitleIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

