package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationSponsorsIterator theOrganizationSponsorsIterator = (OrganizationSponsorsIterator)findAncestorWithClass(this, OrganizationSponsorsIterator.class);
			pageContext.getOut().print(theOrganizationSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

