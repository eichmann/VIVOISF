package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleERO_0000045Iterator theAcademicArticle = (AcademicArticleERO_0000045Iterator)findAncestorWithClass(this, AcademicArticleERO_0000045Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

