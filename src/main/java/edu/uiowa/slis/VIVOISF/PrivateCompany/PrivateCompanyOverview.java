package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			if (!thePrivateCompany.commitNeeded) {
				pageContext.getOut().print(thePrivateCompany.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			return thePrivateCompany.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrivateCompany for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			thePrivateCompany.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for overview tag ");
		}
	}
}

