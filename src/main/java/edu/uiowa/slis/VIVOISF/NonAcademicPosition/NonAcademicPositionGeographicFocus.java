package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionGeographicFocusIterator theNonAcademicPositionGeographicFocusIterator = (NonAcademicPositionGeographicFocusIterator)findAncestorWithClass(this, NonAcademicPositionGeographicFocusIterator.class);
			pageContext.getOut().print(theNonAcademicPositionGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

