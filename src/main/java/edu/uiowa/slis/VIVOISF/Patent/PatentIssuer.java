package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentIssuerIterator thePatentIssuerIterator = (PatentIssuerIterator)findAncestorWithClass(this, PatentIssuerIterator.class);
			pageContext.getOut().print(thePatentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for issuer tag ");
		}
		return SKIP_BODY;
	}
}

