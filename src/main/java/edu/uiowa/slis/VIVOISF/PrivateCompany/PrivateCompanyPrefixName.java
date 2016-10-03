package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyPrefixNameIterator thePrivateCompany = (PrivateCompanyPrefixNameIterator)findAncestorWithClass(this, PrivateCompanyPrefixNameIterator.class);
			pageContext.getOut().print(thePrivateCompany.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

