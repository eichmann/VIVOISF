package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameCurrencyZHIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameCurrencyZHIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

