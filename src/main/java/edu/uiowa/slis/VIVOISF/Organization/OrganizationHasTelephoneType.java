package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasTelephoneIterator theOrganizationHasTelephoneIterator = (OrganizationHasTelephoneIterator)findAncestorWithClass(this, OrganizationHasTelephoneIterator.class);
			pageContext.getOut().print(theOrganizationHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

