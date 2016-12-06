package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDescriptionIterator theAcademicArticle = (AcademicArticleDescriptionIterator)findAncestorWithClass(this, AcademicArticleDescriptionIterator.class);
			pageContext.getOut().print(theAcademicArticle.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for description tag ");
		}
		return SKIP_BODY;
	}
}

