package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortZHIterator theChapter = (ChapterNameShortZHIterator)findAncestorWithClass(this, ChapterNameShortZHIterator.class);
			pageContext.getOut().print(theChapter.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

