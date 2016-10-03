package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberRecipientInverseIterator theFacultyMemberRecipientInverseIterator = (FacultyMemberRecipientInverseIterator)findAncestorWithClass(this, FacultyMemberRecipientInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for recipient tag ");
		}
		return SKIP_BODY;
	}
}

