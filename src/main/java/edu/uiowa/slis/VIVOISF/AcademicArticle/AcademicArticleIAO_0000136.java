package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleIAO_0000136Iterator theAcademicArticleIAO_0000136Iterator = (AcademicArticleIAO_0000136Iterator)findAncestorWithClass(this, AcademicArticleIAO_0000136Iterator.class);
			pageContext.getOut().print(theAcademicArticleIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

