package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameShortRUIterator theAcademicArticle = (AcademicArticleNameShortRUIterator)findAncestorWithClass(this, AcademicArticleNameShortRUIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

