package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionDateTimeIntervalIterator theFacultyPositionDateTimeIntervalIterator = (FacultyPositionDateTimeIntervalIterator)findAncestorWithClass(this, FacultyPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theFacultyPositionDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

