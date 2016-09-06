package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberTranslatorOfIterator theFacultyMemberTranslatorOfIterator = (FacultyMemberTranslatorOfIterator)findAncestorWithClass(this, FacultyMemberTranslatorOfIterator.class);
			pageContext.getOut().print(theFacultyMemberTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

