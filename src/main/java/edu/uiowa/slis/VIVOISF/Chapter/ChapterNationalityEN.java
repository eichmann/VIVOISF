package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNationalityENIterator theChapter = (ChapterNationalityENIterator)findAncestorWithClass(this, ChapterNationalityENIterator.class);
			pageContext.getOut().print(theChapter.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

