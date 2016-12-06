package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasNameIterator theNonAcademicPositionHasNameIterator = (NonAcademicPositionHasNameIterator)findAncestorWithClass(this, NonAcademicPositionHasNameIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

