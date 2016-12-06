package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionDescriptionIterator theNonAcademicPosition = (NonAcademicPositionDescriptionIterator)findAncestorWithClass(this, NonAcademicPositionDescriptionIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for description tag ");
		}
		return SKIP_BODY;
	}
}

