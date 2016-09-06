package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRO_0000052Iterator theResearcherRoleRO_0000052Iterator = (ResearcherRoleRO_0000052Iterator)findAncestorWithClass(this, ResearcherRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theResearcherRoleRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

