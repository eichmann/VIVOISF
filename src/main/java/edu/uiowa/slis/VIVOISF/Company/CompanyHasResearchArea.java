package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasResearchAreaIterator theCompanyHasResearchAreaIterator = (CompanyHasResearchAreaIterator)findAncestorWithClass(this, CompanyHasResearchAreaIterator.class);
			pageContext.getOut().print(theCompanyHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

