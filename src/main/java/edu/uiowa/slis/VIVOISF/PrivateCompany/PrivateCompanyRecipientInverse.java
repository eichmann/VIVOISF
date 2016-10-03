package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyRecipientInverseIterator thePrivateCompanyRecipientInverseIterator = (PrivateCompanyRecipientInverseIterator)findAncestorWithClass(this, PrivateCompanyRecipientInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for recipient tag ");
		}
		return SKIP_BODY;
	}
}

