package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleEditorIterator theAcademicArticleEditorIterator = (AcademicArticleEditorIterator)findAncestorWithClass(this, AcademicArticleEditorIterator.class);
			pageContext.getOut().print(theAcademicArticleEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for editor tag ");
		}
		return SKIP_BODY;
	}
}

