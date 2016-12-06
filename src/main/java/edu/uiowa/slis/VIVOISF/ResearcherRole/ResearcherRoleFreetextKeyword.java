package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleFreetextKeywordIterator theResearcherRole = (ResearcherRoleFreetextKeywordIterator)findAncestorWithClass(this, ResearcherRoleFreetextKeywordIterator.class);
			pageContext.getOut().print(theResearcherRole.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

