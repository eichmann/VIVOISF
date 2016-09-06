package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberFreetextKeywordIterator theFacultyMember = (FacultyMemberFreetextKeywordIterator)findAncestorWithClass(this, FacultyMemberFreetextKeywordIterator.class);
			pageContext.getOut().print(theFacultyMember.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

