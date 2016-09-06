package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			if (!thePrivateCompany.commitNeeded) {
				pageContext.getOut().print(thePrivateCompany.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			return thePrivateCompany.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrivateCompany for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			thePrivateCompany.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for abbreviation tag ");
		}
	}
}

