package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialRUIterator theAcademicArticle = (AcademicArticleNameOfficialRUIterator)findAncestorWithClass(this, AcademicArticleNameOfficialRUIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

