package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasEmailIterator theNonAcademicPositionHasEmailIterator = (NonAcademicPositionHasEmailIterator)findAncestorWithClass(this, NonAcademicPositionHasEmailIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

