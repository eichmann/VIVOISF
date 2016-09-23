package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberSameAsIterator theFacultyMember = (FacultyMemberSameAsIterator)findAncestorWithClass(this, FacultyMemberSameAsIterator.class);
			pageContext.getOut().print(theFacultyMember.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

