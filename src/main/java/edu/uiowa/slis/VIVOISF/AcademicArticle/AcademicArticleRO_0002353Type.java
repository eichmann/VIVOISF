package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRO_0002353Iterator theAcademicArticleRO_0002353Iterator = (AcademicArticleRO_0002353Iterator)findAncestorWithClass(this, AcademicArticleRO_0002353Iterator.class);
			pageContext.getOut().print(theAcademicArticleRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

