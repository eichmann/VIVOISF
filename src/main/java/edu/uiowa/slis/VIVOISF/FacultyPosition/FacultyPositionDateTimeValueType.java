package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionDateTimeValueIterator theFacultyPositionDateTimeValueIterator = (FacultyPositionDateTimeValueIterator)findAncestorWithClass(this, FacultyPositionDateTimeValueIterator.class);
			pageContext.getOut().print(theFacultyPositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

