package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterUriIterator theChapter = (ChapterUriIterator)findAncestorWithClass(this, ChapterUriIterator.class);
			pageContext.getOut().print(theChapter.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for uri tag ");
		}
		return SKIP_BODY;
	}
}

