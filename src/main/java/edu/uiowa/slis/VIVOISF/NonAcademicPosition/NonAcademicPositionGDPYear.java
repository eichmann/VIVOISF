package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionGDPYearIterator theNonAcademicPosition = (NonAcademicPositionGDPYearIterator)findAncestorWithClass(this, NonAcademicPositionGDPYearIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

