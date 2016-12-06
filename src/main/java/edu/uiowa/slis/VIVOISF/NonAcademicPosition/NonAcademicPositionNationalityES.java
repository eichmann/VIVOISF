package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNationalityESIterator theNonAcademicPosition = (NonAcademicPositionNationalityESIterator)findAncestorWithClass(this, NonAcademicPositionNationalityESIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

