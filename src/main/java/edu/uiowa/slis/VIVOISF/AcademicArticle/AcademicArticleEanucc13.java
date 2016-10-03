package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleEanucc13Iterator theAcademicArticle = (AcademicArticleEanucc13Iterator)findAncestorWithClass(this, AcademicArticleEanucc13Iterator.class);
			pageContext.getOut().print(theAcademicArticle.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

