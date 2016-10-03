package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleGtin14Iterator theAcademicArticle = (AcademicArticleGtin14Iterator)findAncestorWithClass(this, AcademicArticleGtin14Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

