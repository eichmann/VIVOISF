package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionDateTimeIntervalIterator theNonAcademicPositionDateTimeIntervalIterator = (NonAcademicPositionDateTimeIntervalIterator)findAncestorWithClass(this, NonAcademicPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theNonAcademicPositionDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

