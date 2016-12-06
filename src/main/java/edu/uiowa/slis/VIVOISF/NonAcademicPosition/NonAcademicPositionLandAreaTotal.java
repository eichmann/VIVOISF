package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionLandAreaTotalIterator theNonAcademicPosition = (NonAcademicPositionLandAreaTotalIterator)findAncestorWithClass(this, NonAcademicPositionLandAreaTotalIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

