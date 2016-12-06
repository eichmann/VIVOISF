package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionLandAreaYearIterator theNonAcademicPosition = (NonAcademicPositionLandAreaYearIterator)findAncestorWithClass(this, NonAcademicPositionLandAreaYearIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

