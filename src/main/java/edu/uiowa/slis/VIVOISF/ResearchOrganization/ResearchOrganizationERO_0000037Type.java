package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationERO_0000037Iterator theResearchOrganizationERO_0000037Iterator = (ResearchOrganizationERO_0000037Iterator)findAncestorWithClass(this, ResearchOrganizationERO_0000037Iterator.class);
			pageContext.getOut().print(theResearchOrganizationERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

