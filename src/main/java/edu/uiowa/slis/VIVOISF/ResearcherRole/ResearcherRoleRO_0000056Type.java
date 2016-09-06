package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRO_0000056Iterator theResearcherRoleRO_0000056Iterator = (ResearcherRoleRO_0000056Iterator)findAncestorWithClass(this, ResearcherRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theResearcherRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

