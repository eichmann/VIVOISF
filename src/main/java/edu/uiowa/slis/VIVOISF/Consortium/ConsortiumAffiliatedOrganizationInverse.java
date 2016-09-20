package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumAffiliatedOrganizationInverseIterator theConsortiumAffiliatedOrganizationInverseIterator = (ConsortiumAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ConsortiumAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theConsortiumAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

