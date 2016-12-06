package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionGDPUnitIterator theNonAcademicPosition = (NonAcademicPositionGDPUnitIterator)findAncestorWithClass(this, NonAcademicPositionGDPUnitIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

