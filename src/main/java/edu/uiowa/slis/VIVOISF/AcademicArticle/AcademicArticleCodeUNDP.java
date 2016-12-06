package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeUNDPIterator theAcademicArticle = (AcademicArticleCodeUNDPIterator)findAncestorWithClass(this, AcademicArticleCodeUNDPIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

