package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionLandAreaTotalIterator theFacultyPosition = (FacultyPositionLandAreaTotalIterator)findAncestorWithClass(this, FacultyPositionLandAreaTotalIterator.class);
			pageContext.getOut().print(theFacultyPosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

