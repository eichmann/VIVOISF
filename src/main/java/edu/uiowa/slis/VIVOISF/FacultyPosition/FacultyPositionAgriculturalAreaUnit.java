package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionAgriculturalAreaUnitIterator theFacultyPosition = (FacultyPositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, FacultyPositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theFacultyPosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

