package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRO_0002234Iterator theResearcherRoleRO_0002234Iterator = (ResearcherRoleRO_0002234Iterator)findAncestorWithClass(this, ResearcherRoleRO_0002234Iterator.class);
			pageContext.getOut().print(theResearcherRoleRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

