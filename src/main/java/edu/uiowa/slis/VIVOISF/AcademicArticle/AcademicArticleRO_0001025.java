package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRO_0001025Iterator theAcademicArticleRO_0001025Iterator = (AcademicArticleRO_0001025Iterator)findAncestorWithClass(this, AcademicArticleRO_0001025Iterator.class);
			pageContext.getOut().print(theAcademicArticleRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

