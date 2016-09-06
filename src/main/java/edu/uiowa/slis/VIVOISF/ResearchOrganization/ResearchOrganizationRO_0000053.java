package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationRO_0000053Iterator theResearchOrganizationRO_0000053Iterator = (ResearchOrganizationRO_0000053Iterator)findAncestorWithClass(this, ResearchOrganizationRO_0000053Iterator.class);
			pageContext.getOut().print(theResearchOrganizationRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

