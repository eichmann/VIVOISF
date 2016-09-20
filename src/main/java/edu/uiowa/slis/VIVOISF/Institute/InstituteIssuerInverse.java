package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteIssuerInverseIterator theInstituteIssuerInverseIterator = (InstituteIssuerInverseIterator)findAncestorWithClass(this, InstituteIssuerInverseIterator.class);
			pageContext.getOut().print(theInstituteIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for issuer tag ");
		}
		return SKIP_BODY;
	}
}

