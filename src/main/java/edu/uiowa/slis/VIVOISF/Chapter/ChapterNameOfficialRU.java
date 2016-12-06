package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameOfficialRUIterator theChapter = (ChapterNameOfficialRUIterator)findAncestorWithClass(this, ChapterNameOfficialRUIterator.class);
			pageContext.getOut().print(theChapter.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

