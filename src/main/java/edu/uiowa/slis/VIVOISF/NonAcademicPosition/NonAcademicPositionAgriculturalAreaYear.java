package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionAgriculturalAreaYearIterator theNonAcademicPosition = (NonAcademicPositionAgriculturalAreaYearIterator)findAncestorWithClass(this, NonAcademicPositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

