package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityFRIterator theNonAcademicPosition = (NonAcademicPositionNationalityFRIterator)findAncestorWithClass(this, NonAcademicPositionNationalityFRIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

