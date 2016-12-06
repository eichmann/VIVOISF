package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionFreetextKeywordIterator theFacultyPosition = (FacultyPositionFreetextKeywordIterator)findAncestorWithClass(this, FacultyPositionFreetextKeywordIterator.class);
			pageContext.getOut().print(theFacultyPosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

