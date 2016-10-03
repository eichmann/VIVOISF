package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterHandleIterator theChapter = (ChapterHandleIterator)findAncestorWithClass(this, ChapterHandleIterator.class);
			pageContext.getOut().print(theChapter.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for handle tag ");
		}
		return SKIP_BODY;
	}
}

