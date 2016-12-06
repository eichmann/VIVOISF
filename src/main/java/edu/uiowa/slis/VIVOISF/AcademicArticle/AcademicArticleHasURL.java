package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasURLIterator theAcademicArticleHasURLIterator = (AcademicArticleHasURLIterator)findAncestorWithClass(this, AcademicArticleHasURLIterator.class);
			pageContext.getOut().print(theAcademicArticleHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

