package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterLocatorIterator theChapter = (ChapterLocatorIterator)findAncestorWithClass(this, ChapterLocatorIterator.class);
			pageContext.getOut().print(theChapter.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for locator tag ");
		}
		return SKIP_BODY;
	}
}

