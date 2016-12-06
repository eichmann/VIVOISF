package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeGAULIterator theResearcherRole = (ResearcherRoleCodeGAULIterator)findAncestorWithClass(this, ResearcherRoleCodeGAULIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

