package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeUNIterator theAcademicArticle = (AcademicArticleCodeUNIterator)findAncestorWithClass(this, AcademicArticleCodeUNIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

