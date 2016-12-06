package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRelatedByIterator theNonAcademicPositionRelatedByIterator = (NonAcademicPositionRelatedByIterator)findAncestorWithClass(this, NonAcademicPositionRelatedByIterator.class);
			pageContext.getOut().print(theNonAcademicPositionRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

