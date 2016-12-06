package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortESIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortESIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortESIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

