package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOrcidIdType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOrcidIdType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOrcidIdType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberOrcidIdIterator theFacultyMemberOrcidIdIterator = (FacultyMemberOrcidIdIterator)findAncestorWithClass(this, FacultyMemberOrcidIdIterator.class);
			pageContext.getOut().print(theFacultyMemberOrcidIdIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

