package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameListARIterator theAcademicArticle = (AcademicArticleNameListARIterator)findAncestorWithClass(this, AcademicArticleNameListARIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

