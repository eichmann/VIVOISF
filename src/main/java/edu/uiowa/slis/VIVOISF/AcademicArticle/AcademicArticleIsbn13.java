package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleIsbn13Iterator theAcademicArticle = (AcademicArticleIsbn13Iterator)findAncestorWithClass(this, AcademicArticleIsbn13Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

