package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleIssuerIterator theAcademicArticleIssuerIterator = (AcademicArticleIssuerIterator)findAncestorWithClass(this, AcademicArticleIssuerIterator.class);
			pageContext.getOut().print(theAcademicArticleIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for issuer tag ");
		}
		return SKIP_BODY;
	}
}

