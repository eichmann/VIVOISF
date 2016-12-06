package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNationalityFRIterator theChapter = (ChapterNationalityFRIterator)findAncestorWithClass(this, ChapterNationalityFRIterator.class);
			pageContext.getOut().print(theChapter.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

