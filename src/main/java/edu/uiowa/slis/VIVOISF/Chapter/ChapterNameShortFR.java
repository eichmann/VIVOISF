package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortFRIterator theChapter = (ChapterNameShortFRIterator)findAncestorWithClass(this, ChapterNameShortFRIterator.class);
			pageContext.getOut().print(theChapter.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

