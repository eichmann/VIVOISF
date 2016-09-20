package edu.uiowa.slis.VIVOISF.AcademicYear;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicYearDateTimeIntervalInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicYearDateTimeIntervalInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicYearDateTimeIntervalInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicYearDateTimeIntervalInverseIterator theAcademicYearDateTimeIntervalInverseIterator = (AcademicYearDateTimeIntervalInverseIterator)findAncestorWithClass(this, AcademicYearDateTimeIntervalInverseIterator.class);
			pageContext.getOut().print(theAcademicYearDateTimeIntervalInverseIterator.getDateTimeIntervalInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

