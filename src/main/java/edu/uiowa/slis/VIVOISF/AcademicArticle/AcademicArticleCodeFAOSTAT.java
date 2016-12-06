package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeFAOSTATIterator theAcademicArticle = (AcademicArticleCodeFAOSTATIterator)findAncestorWithClass(this, AcademicArticleCodeFAOSTATIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

