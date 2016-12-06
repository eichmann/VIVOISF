package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityITIterator theNonAcademicPosition = (NonAcademicPositionNationalityITIterator)findAncestorWithClass(this, NonAcademicPositionNationalityITIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

