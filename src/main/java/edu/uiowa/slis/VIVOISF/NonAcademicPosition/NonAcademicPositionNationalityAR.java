package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityARIterator theNonAcademicPosition = (NonAcademicPositionNationalityARIterator)findAncestorWithClass(this, NonAcademicPositionNationalityARIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

