package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeISO2Iterator theAcademicArticle = (AcademicArticleCodeISO2Iterator)findAncestorWithClass(this, AcademicArticleCodeISO2Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

