package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionAgriculturalAreaTotalIterator theFacultyPosition = (FacultyPositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, FacultyPositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theFacultyPosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

