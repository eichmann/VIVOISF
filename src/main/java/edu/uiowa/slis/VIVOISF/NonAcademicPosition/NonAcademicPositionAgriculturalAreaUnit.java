package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionAgriculturalAreaUnitIterator theNonAcademicPosition = (NonAcademicPositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, NonAcademicPositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

