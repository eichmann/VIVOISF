package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRO_0002234Iterator theAcademicArticleRO_0002234Iterator = (AcademicArticleRO_0002234Iterator)findAncestorWithClass(this, AcademicArticleRO_0002234Iterator.class);
			pageContext.getOut().print(theAcademicArticleRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

