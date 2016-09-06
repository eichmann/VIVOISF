package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			if (!thePrivateCompany.commitNeeded) {
				pageContext.getOut().print(thePrivateCompany.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			return thePrivateCompany.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrivateCompany for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			thePrivateCompany.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for label tag ");
		}
	}
}

