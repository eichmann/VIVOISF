package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocIssuerInverseIterator thePostdocIssuerInverseIterator = (PostdocIssuerInverseIterator)findAncestorWithClass(this, PostdocIssuerInverseIterator.class);
			pageContext.getOut().print(thePostdocIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for issuer tag ");
		}
		return SKIP_BODY;
	}
}

