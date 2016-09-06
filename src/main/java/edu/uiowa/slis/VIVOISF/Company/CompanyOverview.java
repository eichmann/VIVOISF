package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			if (!theCompany.commitNeeded) {
				pageContext.getOut().print(theCompany.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Company for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			return theCompany.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Company for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			theCompany.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Company for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for overview tag ");
		}
	}
}

