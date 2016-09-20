package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyOBI_0000304InverseIterator thePrivateCompanyOBI_0000304InverseIterator = (PrivateCompanyOBI_0000304InverseIterator)findAncestorWithClass(this, PrivateCompanyOBI_0000304InverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

