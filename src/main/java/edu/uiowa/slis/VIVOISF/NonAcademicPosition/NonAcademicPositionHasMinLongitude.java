package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasMinLongitudeIterator theNonAcademicPosition = (NonAcademicPositionHasMinLongitudeIterator)findAncestorWithClass(this, NonAcademicPositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

