package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyDateTimeValueIterator theCompanyDateTimeValueIterator = (CompanyDateTimeValueIterator)findAncestorWithClass(this, CompanyDateTimeValueIterator.class);
			pageContext.getOut().print(theCompanyDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

