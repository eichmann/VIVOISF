package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionLandAreaUnitIterator theNonAcademicPosition = (NonAcademicPositionLandAreaUnitIterator)findAncestorWithClass(this, NonAcademicPositionLandAreaUnitIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

