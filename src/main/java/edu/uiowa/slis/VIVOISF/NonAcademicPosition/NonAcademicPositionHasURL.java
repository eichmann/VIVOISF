package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasURLIterator theNonAcademicPositionHasURLIterator = (NonAcademicPositionHasURLIterator)findAncestorWithClass(this, NonAcademicPositionHasURLIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

