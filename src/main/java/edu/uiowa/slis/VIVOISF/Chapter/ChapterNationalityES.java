package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNationalityESIterator theChapter = (ChapterNationalityESIterator)findAncestorWithClass(this, ChapterNationalityESIterator.class);
			pageContext.getOut().print(theChapter.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

