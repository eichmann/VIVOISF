package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameListFRIterator theAcademicArticle = (AcademicArticleNameListFRIterator)findAncestorWithClass(this, AcademicArticleNameListFRIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

