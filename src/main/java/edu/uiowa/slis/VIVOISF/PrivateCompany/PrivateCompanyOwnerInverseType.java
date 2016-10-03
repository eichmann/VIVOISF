package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyOwnerInverseIterator thePrivateCompanyOwnerInverseIterator = (PrivateCompanyOwnerInverseIterator)findAncestorWithClass(this, PrivateCompanyOwnerInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for owner tag ");
		}
		return SKIP_BODY;
	}
}

