package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionGeographicFocusIterator theNonAcademicPositionGeographicFocusIterator = (NonAcademicPositionGeographicFocusIterator)findAncestorWithClass(this, NonAcademicPositionGeographicFocusIterator.class);
			pageContext.getOut().print(theNonAcademicPositionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

