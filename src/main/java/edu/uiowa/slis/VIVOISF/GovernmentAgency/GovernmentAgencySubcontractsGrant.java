package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencySubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencySubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencySubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencySubcontractsGrantIterator theGovernmentAgencySubcontractsGrantIterator = (GovernmentAgencySubcontractsGrantIterator)findAncestorWithClass(this, GovernmentAgencySubcontractsGrantIterator.class);
			pageContext.getOut().print(theGovernmentAgencySubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

