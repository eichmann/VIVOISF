package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleTheAbstractIterator theAcademicArticle = (AcademicArticleTheAbstractIterator)findAncestorWithClass(this, AcademicArticleTheAbstractIterator.class);
			pageContext.getOut().print(theAcademicArticle.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

