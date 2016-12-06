package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameListFRIterator theChapter = (ChapterNameListFRIterator)findAncestorWithClass(this, ChapterNameListFRIterator.class);
			pageContext.getOut().print(theChapter.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

