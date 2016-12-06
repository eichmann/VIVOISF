package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasMaxLongitudeIterator theNonAcademicPosition = (NonAcademicPositionHasMaxLongitudeIterator)findAncestorWithClass(this, NonAcademicPositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

