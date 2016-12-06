package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListRUIterator theResearcherRole = (ResearcherRoleNameListRUIterator)findAncestorWithClass(this, ResearcherRoleNameListRUIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}
