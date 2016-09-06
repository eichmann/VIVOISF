package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDocumentationForIterator theAcademicArticleDocumentationForIterator = (AcademicArticleDocumentationForIterator)findAncestorWithClass(this, AcademicArticleDocumentationForIterator.class);
			pageContext.getOut().print(theAcademicArticleDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

