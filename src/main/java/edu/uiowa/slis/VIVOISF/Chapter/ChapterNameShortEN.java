package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortENIterator theChapter = (ChapterNameShortENIterator)findAncestorWithClass(this, ChapterNameShortENIterator.class);
			pageContext.getOut().print(theChapter.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

