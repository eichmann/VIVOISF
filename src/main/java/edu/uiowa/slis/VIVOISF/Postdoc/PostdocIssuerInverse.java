package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocIssuerInverseIterator thePostdocIssuerInverseIterator = (PostdocIssuerInverseIterator)findAncestorWithClass(this, PostdocIssuerInverseIterator.class);
			pageContext.getOut().print(thePostdocIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for issuer tag ");
		}
		return SKIP_BODY;
	}
}

