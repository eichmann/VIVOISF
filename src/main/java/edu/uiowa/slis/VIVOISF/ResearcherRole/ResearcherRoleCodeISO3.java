package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeISO3Iterator theResearcherRole = (ResearcherRoleCodeISO3Iterator)findAncestorWithClass(this, ResearcherRoleCodeISO3Iterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

