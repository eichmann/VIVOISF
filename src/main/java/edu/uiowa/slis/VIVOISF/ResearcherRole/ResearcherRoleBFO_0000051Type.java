package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleBFO_0000051Iterator theResearcherRoleBFO_0000051Iterator = (ResearcherRoleBFO_0000051Iterator)findAncestorWithClass(this, ResearcherRoleBFO_0000051Iterator.class);
			pageContext.getOut().print(theResearcherRoleBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

