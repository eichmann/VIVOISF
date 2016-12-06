package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortRUIterator theResearcherRole = (ResearcherRoleNameShortRUIterator)findAncestorWithClass(this, ResearcherRoleNameShortRUIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

