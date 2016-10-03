package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleEditorListIterator theAcademicArticleEditorListIterator = (AcademicArticleEditorListIterator)findAncestorWithClass(this, AcademicArticleEditorListIterator.class);
			pageContext.getOut().print(theAcademicArticleEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for editorList tag ");
		}
		return SKIP_BODY;
	}
}

