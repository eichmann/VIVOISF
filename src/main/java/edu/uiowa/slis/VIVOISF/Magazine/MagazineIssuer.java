package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIssuerIterator theMagazineIssuerIterator = (MagazineIssuerIterator)findAncestorWithClass(this, MagazineIssuerIterator.class);
			pageContext.getOut().print(theMagazineIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for issuer tag ");
		}
		return SKIP_BODY;
	}
}

