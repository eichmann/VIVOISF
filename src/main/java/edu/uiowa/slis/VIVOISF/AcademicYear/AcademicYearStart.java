package edu.uiowa.slis.VIVOISF.AcademicYear;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicYearStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicYearStart currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicYearStart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicYearStartIterator theAcademicYearStartIterator = (AcademicYearStartIterator)findAncestorWithClass(this, AcademicYearStartIterator.class);
			pageContext.getOut().print(theAcademicYearStartIterator.getStart());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for start tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for start tag ");
		}
		return SKIP_BODY;
	}
}

