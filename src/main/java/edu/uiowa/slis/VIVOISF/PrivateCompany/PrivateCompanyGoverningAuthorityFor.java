package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyGoverningAuthorityForIterator thePrivateCompanyGoverningAuthorityForIterator = (PrivateCompanyGoverningAuthorityForIterator)findAncestorWithClass(this, PrivateCompanyGoverningAuthorityForIterator.class);
			pageContext.getOut().print(thePrivateCompanyGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

