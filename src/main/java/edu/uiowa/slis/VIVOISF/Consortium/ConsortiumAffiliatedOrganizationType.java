package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumAffiliatedOrganizationIterator theConsortiumAffiliatedOrganizationIterator = (ConsortiumAffiliatedOrganizationIterator)findAncestorWithClass(this, ConsortiumAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theConsortiumAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

