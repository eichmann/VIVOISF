package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRO_0001025Iterator theResearcherRoleRO_0001025Iterator = (ResearcherRoleRO_0001025Iterator)findAncestorWithClass(this, ResearcherRoleRO_0001025Iterator.class);
			pageContext.getOut().print(theResearcherRoleRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

