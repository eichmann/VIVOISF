package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			if (!theCompany.commitNeeded) {
				pageContext.getOut().print(theCompany.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Company for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			return theCompany.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Company for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			theCompany.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Company for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for abbreviation tag ");
		}
	}
}

