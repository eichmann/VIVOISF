package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasMinLatitudeIterator theNonAcademicPosition = (NonAcademicPositionHasMinLatitudeIterator)findAncestorWithClass(this, NonAcademicPositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

