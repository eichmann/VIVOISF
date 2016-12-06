package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasSubjectAreaIterator theCompanyHasSubjectAreaIterator = (CompanyHasSubjectAreaIterator)findAncestorWithClass(this, CompanyHasSubjectAreaIterator.class);
			pageContext.getOut().print(theCompanyHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

