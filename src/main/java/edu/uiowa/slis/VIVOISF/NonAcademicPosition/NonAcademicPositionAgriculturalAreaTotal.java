package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionAgriculturalAreaTotalIterator theNonAcademicPosition = (NonAcademicPositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, NonAcademicPositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

