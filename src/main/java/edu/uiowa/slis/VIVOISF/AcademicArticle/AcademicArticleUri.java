package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleUri currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleUriIterator theAcademicArticle = (AcademicArticleUriIterator)findAncestorWithClass(this, AcademicArticleUriIterator.class);
			pageContext.getOut().print(theAcademicArticle.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for uri tag ");
		}
		return SKIP_BODY;
	}
}

