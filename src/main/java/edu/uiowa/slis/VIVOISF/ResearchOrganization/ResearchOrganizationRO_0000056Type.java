package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationRO_0000056Iterator theResearchOrganizationRO_0000056Iterator = (ResearchOrganizationRO_0000056Iterator)findAncestorWithClass(this, ResearchOrganizationRO_0000056Iterator.class);
			pageContext.getOut().print(theResearchOrganizationRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

