package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyRecipientInverseIterator thePrivateCompanyRecipientInverseIterator = (PrivateCompanyRecipientInverseIterator)findAncestorWithClass(this, PrivateCompanyRecipientInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for recipient tag ");
		}
		return SKIP_BODY;
	}
}

