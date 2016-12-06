package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNationalityRUIterator theChapter = (ChapterNationalityRUIterator)findAncestorWithClass(this, ChapterNationalityRUIterator.class);
			pageContext.getOut().print(theChapter.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

