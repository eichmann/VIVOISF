package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterIdentifierIterator theChapter = (ChapterIdentifierIterator)findAncestorWithClass(this, ChapterIdentifierIterator.class);
			pageContext.getOut().print(theChapter.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for identifier tag ");
		}
		return SKIP_BODY;
	}
}

