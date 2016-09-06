package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanySponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanySponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanySponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanySponsorsIterator thePrivateCompanySponsorsIterator = (PrivateCompanySponsorsIterator)findAncestorWithClass(this, PrivateCompanySponsorsIterator.class);
			pageContext.getOut().print(thePrivateCompanySponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

