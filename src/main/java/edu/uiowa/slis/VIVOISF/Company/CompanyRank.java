package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRank currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyRankIterator theCompany = (CompanyRankIterator)findAncestorWithClass(this, CompanyRankIterator.class);
			pageContext.getOut().print(theCompany.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for rank tag ");
		}
		return SKIP_BODY;
	}
}

