package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionFreetextKeywordIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionFreetextKeywordIterator)findAncestorWithClass(this, FacultyAdministrativePositionFreetextKeywordIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

