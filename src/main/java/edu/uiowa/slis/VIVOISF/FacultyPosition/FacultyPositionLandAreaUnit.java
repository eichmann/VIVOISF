package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionLandAreaUnitIterator theFacultyPosition = (FacultyPositionLandAreaUnitIterator)findAncestorWithClass(this, FacultyPositionLandAreaUnitIterator.class);
			pageContext.getOut().print(theFacultyPosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

