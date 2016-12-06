package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionDateTimeValueIterator theNonAcademicPositionDateTimeValueIterator = (NonAcademicPositionDateTimeValueIterator)findAncestorWithClass(this, NonAcademicPositionDateTimeValueIterator.class);
			pageContext.getOut().print(theNonAcademicPositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

