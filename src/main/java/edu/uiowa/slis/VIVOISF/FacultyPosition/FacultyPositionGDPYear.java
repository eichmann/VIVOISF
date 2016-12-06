package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionGDPYearIterator theFacultyPosition = (FacultyPositionGDPYearIterator)findAncestorWithClass(this, FacultyPositionGDPYearIterator.class);
			pageContext.getOut().print(theFacultyPosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

