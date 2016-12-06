package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleARG_2000028Iterator theResearcherRoleARG_2000028Iterator = (ResearcherRoleARG_2000028Iterator)findAncestorWithClass(this, ResearcherRoleARG_2000028Iterator.class);
			pageContext.getOut().print(theResearcherRoleARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

