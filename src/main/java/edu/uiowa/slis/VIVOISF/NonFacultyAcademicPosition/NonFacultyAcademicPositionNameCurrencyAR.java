package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameCurrencyARIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameCurrencyARIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameCurrencyARIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

