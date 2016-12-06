package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameListENIterator theChapter = (ChapterNameListENIterator)findAncestorWithClass(this, ChapterNameListENIterator.class);
			pageContext.getOut().print(theChapter.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

