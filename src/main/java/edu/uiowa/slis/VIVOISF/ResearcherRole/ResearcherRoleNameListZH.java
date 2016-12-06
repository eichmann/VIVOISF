package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListZHIterator theResearcherRole = (ResearcherRoleNameListZHIterator)findAncestorWithClass(this, ResearcherRoleNameListZHIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

