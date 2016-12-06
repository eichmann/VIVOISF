package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHDITotalIterator theNonAcademicPosition = (NonAcademicPositionHDITotalIterator)findAncestorWithClass(this, NonAcademicPositionHDITotalIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

