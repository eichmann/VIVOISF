package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameListITIterator theAcademicArticle = (AcademicArticleNameListITIterator)findAncestorWithClass(this, AcademicArticleNameListITIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

