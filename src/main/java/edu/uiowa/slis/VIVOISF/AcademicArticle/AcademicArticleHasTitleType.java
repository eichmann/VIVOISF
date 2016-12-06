package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasTitleIterator theAcademicArticleHasTitleIterator = (AcademicArticleHasTitleIterator)findAncestorWithClass(this, AcademicArticleHasTitleIterator.class);
			pageContext.getOut().print(theAcademicArticleHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

