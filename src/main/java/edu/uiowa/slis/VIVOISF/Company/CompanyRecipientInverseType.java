package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRecipientInverseIterator theCompanyRecipientInverseIterator = (CompanyRecipientInverseIterator)findAncestorWithClass(this, CompanyRecipientInverseIterator.class);
			pageContext.getOut().print(theCompanyRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for recipient tag ");
		}
		return SKIP_BODY;
	}
}

