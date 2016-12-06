package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeISO2Iterator theResearcherRole = (ResearcherRoleCodeISO2Iterator)findAncestorWithClass(this, ResearcherRoleCodeISO2Iterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}
