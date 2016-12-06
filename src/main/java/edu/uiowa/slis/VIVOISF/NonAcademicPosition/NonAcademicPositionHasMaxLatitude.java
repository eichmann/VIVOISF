package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasMaxLatitudeIterator theNonAcademicPosition = (NonAcademicPositionHasMaxLatitudeIterator)findAncestorWithClass(this, NonAcademicPositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

