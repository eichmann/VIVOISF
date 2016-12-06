package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasTelephoneIterator theCompanyHasTelephoneIterator = (CompanyHasTelephoneIterator)findAncestorWithClass(this, CompanyHasTelephoneIterator.class);
			pageContext.getOut().print(theCompanyHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

