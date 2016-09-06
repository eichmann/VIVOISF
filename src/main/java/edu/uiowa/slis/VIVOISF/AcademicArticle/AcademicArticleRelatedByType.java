package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRelatedByIterator theAcademicArticleRelatedByIterator = (AcademicArticleRelatedByIterator)findAncestorWithClass(this, AcademicArticleRelatedByIterator.class);
			pageContext.getOut().print(theAcademicArticleRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

