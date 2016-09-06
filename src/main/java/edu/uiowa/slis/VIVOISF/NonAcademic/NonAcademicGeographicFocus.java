package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicGeographicFocusIterator theNonAcademicGeographicFocusIterator = (NonAcademicGeographicFocusIterator)findAncestorWithClass(this, NonAcademicGeographicFocusIterator.class);
			pageContext.getOut().print(theNonAcademicGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

