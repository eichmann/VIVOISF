package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameOfficialENIterator theChapter = (ChapterNameOfficialENIterator)findAncestorWithClass(this, ChapterNameOfficialENIterator.class);
			pageContext.getOut().print(theChapter.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

