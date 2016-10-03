package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleShortDescriptionIterator theAcademicArticle = (AcademicArticleShortDescriptionIterator)findAncestorWithClass(this, AcademicArticleShortDescriptionIterator.class);
			pageContext.getOut().print(theAcademicArticle.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

