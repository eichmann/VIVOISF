package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleIsbn10Iterator theAcademicArticle = (AcademicArticleIsbn10Iterator)findAncestorWithClass(this, AcademicArticleIsbn10Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

