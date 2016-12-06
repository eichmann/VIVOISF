package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionGDPUnitIterator theFacultyPosition = (FacultyPositionGDPUnitIterator)findAncestorWithClass(this, FacultyPositionGDPUnitIterator.class);
			pageContext.getOut().print(theFacultyPosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

