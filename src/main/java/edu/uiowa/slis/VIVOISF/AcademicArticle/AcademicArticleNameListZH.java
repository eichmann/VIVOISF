package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameListZHIterator theAcademicArticle = (AcademicArticleNameListZHIterator)findAncestorWithClass(this, AcademicArticleNameListZHIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

