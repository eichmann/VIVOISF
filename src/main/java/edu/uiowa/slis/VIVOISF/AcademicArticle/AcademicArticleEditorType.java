package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleEditorIterator theAcademicArticleEditorIterator = (AcademicArticleEditorIterator)findAncestorWithClass(this, AcademicArticleEditorIterator.class);
			pageContext.getOut().print(theAcademicArticleEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for editor tag ");
		}
		return SKIP_BODY;
	}
}

