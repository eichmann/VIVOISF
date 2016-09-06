package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePageEndIterator theAcademicArticle = (AcademicArticlePageEndIterator)findAncestorWithClass(this, AcademicArticlePageEndIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

