package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanySuffixNameIterator thePrivateCompany = (PrivateCompanySuffixNameIterator)findAncestorWithClass(this, PrivateCompanySuffixNameIterator.class);
			pageContext.getOut().print(thePrivateCompany.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

