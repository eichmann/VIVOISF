package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasAddressIterator theFacultyPositionHasAddressIterator = (FacultyPositionHasAddressIterator)findAncestorWithClass(this, FacultyPositionHasAddressIterator.class);
			pageContext.getOut().print(theFacultyPositionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

