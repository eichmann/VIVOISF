package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeFAOTERMIterator theAcademicArticle = (AcademicArticleCodeFAOTERMIterator)findAncestorWithClass(this, AcademicArticleCodeFAOTERMIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

