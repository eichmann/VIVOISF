package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentIssuerIterator thePatentIssuerIterator = (PatentIssuerIterator)findAncestorWithClass(this, PatentIssuerIterator.class);
			pageContext.getOut().print(thePatentIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for issuer tag ");
		}
		return SKIP_BODY;
	}
}

