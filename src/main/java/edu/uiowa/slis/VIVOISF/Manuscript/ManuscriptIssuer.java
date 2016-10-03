package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptIssuerIterator theManuscriptIssuerIterator = (ManuscriptIssuerIterator)findAncestorWithClass(this, ManuscriptIssuerIterator.class);
			pageContext.getOut().print(theManuscriptIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for issuer tag ");
		}
		return SKIP_BODY;
	}
}

