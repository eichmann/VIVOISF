package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleIdentifierIterator theAcademicArticle = (AcademicArticleIdentifierIterator)findAncestorWithClass(this, AcademicArticleIdentifierIterator.class);
			pageContext.getOut().print(theAcademicArticle.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for identifier tag ");
		}
		return SKIP_BODY;
	}
}

