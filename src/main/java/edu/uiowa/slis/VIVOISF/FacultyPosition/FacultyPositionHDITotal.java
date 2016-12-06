package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHDITotalIterator theFacultyPosition = (FacultyPositionHDITotalIterator)findAncestorWithClass(this, FacultyPositionHDITotalIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

