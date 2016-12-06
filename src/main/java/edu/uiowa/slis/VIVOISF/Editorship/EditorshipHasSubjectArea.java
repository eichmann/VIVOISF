package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasSubjectAreaIterator theEditorshipHasSubjectAreaIterator = (EditorshipHasSubjectAreaIterator)findAncestorWithClass(this, EditorshipHasSubjectAreaIterator.class);
			pageContext.getOut().print(theEditorshipHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

