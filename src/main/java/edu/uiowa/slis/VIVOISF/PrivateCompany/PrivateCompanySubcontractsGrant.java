package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanySubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanySubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanySubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanySubcontractsGrantIterator thePrivateCompanySubcontractsGrantIterator = (PrivateCompanySubcontractsGrantIterator)findAncestorWithClass(this, PrivateCompanySubcontractsGrantIterator.class);
			pageContext.getOut().print(thePrivateCompanySubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

