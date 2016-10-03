package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberPerformerInverseIterator theFacultyMemberPerformerInverseIterator = (FacultyMemberPerformerInverseIterator)findAncestorWithClass(this, FacultyMemberPerformerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for performer tag ");
		}
		return SKIP_BODY;
	}
}

