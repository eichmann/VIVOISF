package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanySubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanySubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanySubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanySubcontractsGrantIterator theCompanySubcontractsGrantIterator = (CompanySubcontractsGrantIterator)findAncestorWithClass(this, CompanySubcontractsGrantIterator.class);
			pageContext.getOut().print(theCompanySubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

