package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRO_0001015Iterator theResearcherRoleRO_0001015Iterator = (ResearcherRoleRO_0001015Iterator)findAncestorWithClass(this, ResearcherRoleRO_0001015Iterator.class);
			pageContext.getOut().print(theResearcherRoleRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

