package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationERO_0000031Iterator theResearchOrganizationERO_0000031Iterator = (ResearchOrganizationERO_0000031Iterator)findAncestorWithClass(this, ResearchOrganizationERO_0000031Iterator.class);
			pageContext.getOut().print(theResearchOrganizationERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

