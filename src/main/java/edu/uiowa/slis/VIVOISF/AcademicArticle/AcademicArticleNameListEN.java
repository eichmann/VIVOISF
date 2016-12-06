package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameListENIterator theAcademicArticle = (AcademicArticleNameListENIterator)findAncestorWithClass(this, AcademicArticleNameListENIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

