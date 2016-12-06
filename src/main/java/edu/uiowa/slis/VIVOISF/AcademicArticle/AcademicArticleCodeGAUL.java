package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeGAULIterator theAcademicArticle = (AcademicArticleCodeGAULIterator)findAncestorWithClass(this, AcademicArticleCodeGAULIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

