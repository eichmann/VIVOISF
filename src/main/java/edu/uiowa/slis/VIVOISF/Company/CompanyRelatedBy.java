package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRelatedByIterator theCompanyRelatedByIterator = (CompanyRelatedByIterator)findAncestorWithClass(this, CompanyRelatedByIterator.class);
			pageContext.getOut().print(theCompanyRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

