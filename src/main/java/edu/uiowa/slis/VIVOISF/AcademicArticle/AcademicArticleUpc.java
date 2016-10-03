package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleUpcIterator theAcademicArticle = (AcademicArticleUpcIterator)findAncestorWithClass(this, AcademicArticleUpcIterator.class);
			pageContext.getOut().print(theAcademicArticle.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for upc tag ");
		}
		return SKIP_BODY;
	}
}

