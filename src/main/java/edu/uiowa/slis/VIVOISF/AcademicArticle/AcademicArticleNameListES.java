package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameListESIterator theAcademicArticle = (AcademicArticleNameListESIterator)findAncestorWithClass(this, AcademicArticleNameListESIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

