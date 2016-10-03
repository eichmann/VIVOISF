package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleIssuerIterator theEditorialArticleIssuerIterator = (EditorialArticleIssuerIterator)findAncestorWithClass(this, EditorialArticleIssuerIterator.class);
			pageContext.getOut().print(theEditorialArticleIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for issuer tag ");
		}
		return SKIP_BODY;
	}
}

