package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyDirectorInverseIterator thePrivateCompanyDirectorInverseIterator = (PrivateCompanyDirectorInverseIterator)findAncestorWithClass(this, PrivateCompanyDirectorInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for director tag ");
		}
		return SKIP_BODY;
	}
}

