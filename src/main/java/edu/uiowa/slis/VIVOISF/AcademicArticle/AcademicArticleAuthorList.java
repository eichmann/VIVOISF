package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleAuthorListIterator theAcademicArticleAuthorListIterator = (AcademicArticleAuthorListIterator)findAncestorWithClass(this, AcademicArticleAuthorListIterator.class);
			pageContext.getOut().print(theAcademicArticleAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for authorList tag ");
		}
		return SKIP_BODY;
	}
}

