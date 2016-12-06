package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			if (!theCompany.commitNeeded) {
				pageContext.getOut().print(theCompany.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			return theCompany.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Company for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			theCompany.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hideFromDisplay tag ");
		}
	}
}

