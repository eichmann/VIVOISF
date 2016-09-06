package edu.uiowa.slis.VIVOISF.AcademicYear;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicYearEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicYearEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicYearEnd.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicYearEndIterator theAcademicYearEndIterator = (AcademicYearEndIterator)findAncestorWithClass(this, AcademicYearEndIterator.class);
			pageContext.getOut().print(theAcademicYearEndIterator.getEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicYear for end tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicYear for end tag ");
		}
		return SKIP_BODY;
	}
}

