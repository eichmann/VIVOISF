package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleARG_0000001Iterator theAcademicArticle = (AcademicArticleARG_0000001Iterator)findAncestorWithClass(this, AcademicArticleARG_0000001Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

