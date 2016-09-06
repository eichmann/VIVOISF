package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyRO_0000056Iterator thePrivateCompanyRO_0000056Iterator = (PrivateCompanyRO_0000056Iterator)findAncestorWithClass(this, PrivateCompanyRO_0000056Iterator.class);
			pageContext.getOut().print(thePrivateCompanyRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

