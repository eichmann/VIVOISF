package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListRUIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListRUIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListRUIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

