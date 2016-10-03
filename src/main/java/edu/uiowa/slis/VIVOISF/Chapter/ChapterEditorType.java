package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterEditorIterator theChapterEditorIterator = (ChapterEditorIterator)findAncestorWithClass(this, ChapterEditorIterator.class);
			pageContext.getOut().print(theChapterEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for editor tag ");
		}
		return SKIP_BODY;
	}
}

