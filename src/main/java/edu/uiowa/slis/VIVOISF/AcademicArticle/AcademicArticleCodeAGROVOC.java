package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeAGROVOCIterator theAcademicArticle = (AcademicArticleCodeAGROVOCIterator)findAncestorWithClass(this, AcademicArticleCodeAGROVOCIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

