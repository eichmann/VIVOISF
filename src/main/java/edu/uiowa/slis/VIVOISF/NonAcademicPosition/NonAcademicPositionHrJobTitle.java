package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHrJobTitleIterator theNonAcademicPosition = (NonAcademicPositionHrJobTitleIterator)findAncestorWithClass(this, NonAcademicPositionHrJobTitleIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

