package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationERO_0001520Iterator theResearchOrganizationERO_0001520Iterator = (ResearchOrganizationERO_0001520Iterator)findAncestorWithClass(this, ResearchOrganizationERO_0001520Iterator.class);
			pageContext.getOut().print(theResearchOrganizationERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

