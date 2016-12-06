package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasAddressIterator theFacultyAdministrativePositionHasAddressIterator = (FacultyAdministrativePositionHasAddressIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasAddressIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

