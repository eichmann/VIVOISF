package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRO_0002234Iterator theOrganizationRO_0002234Iterator = (OrganizationRO_0002234Iterator)findAncestorWithClass(this, OrganizationRO_0002234Iterator.class);
			pageContext.getOut().print(theOrganizationRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

