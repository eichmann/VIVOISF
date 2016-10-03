package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHandleIterator theAcademicArticle = (AcademicArticleHandleIterator)findAncestorWithClass(this, AcademicArticleHandleIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for handle tag ");
		}
		return SKIP_BODY;
	}
}

