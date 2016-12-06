package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortRUIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortRUIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortRUIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

