package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionDateTimeIntervalIterator theFacultyAdministrativePositionDateTimeIntervalIterator = (FacultyAdministrativePositionDateTimeIntervalIterator)findAncestorWithClass(this, FacultyAdministrativePositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

