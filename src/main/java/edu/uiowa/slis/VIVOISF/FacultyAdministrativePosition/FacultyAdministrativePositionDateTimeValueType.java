package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionDateTimeValueIterator theFacultyAdministrativePositionDateTimeValueIterator = (FacultyAdministrativePositionDateTimeValueIterator)findAncestorWithClass(this, FacultyAdministrativePositionDateTimeValueIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

