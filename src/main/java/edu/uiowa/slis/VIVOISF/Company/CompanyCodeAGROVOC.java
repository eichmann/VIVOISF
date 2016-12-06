package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeAGROVOCIterator theCompany = (CompanyCodeAGROVOCIterator)findAncestorWithClass(this, CompanyCodeAGROVOCIterator.class);
			pageContext.getOut().print(theCompany.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

