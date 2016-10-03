package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterOwnerIterator theChapterOwnerIterator = (ChapterOwnerIterator)findAncestorWithClass(this, ChapterOwnerIterator.class);
			pageContext.getOut().print(theChapterOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for owner tag ");
		}
		return SKIP_BODY;
	}
}
