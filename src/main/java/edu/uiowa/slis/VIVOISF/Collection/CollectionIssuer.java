package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIssuerIterator theCollectionIssuerIterator = (CollectionIssuerIterator)findAncestorWithClass(this, CollectionIssuerIterator.class);
			pageContext.getOut().print(theCollectionIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for issuer tag ");
		}
		return SKIP_BODY;
	}
}

