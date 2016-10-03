package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterEditorListIterator theChapterEditorListIterator = (ChapterEditorListIterator)findAncestorWithClass(this, ChapterEditorListIterator.class);
			pageContext.getOut().print(theChapterEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for editorList tag ");
		}
		return SKIP_BODY;
	}
}

