package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNationalityITIterator theChapter = (ChapterNationalityITIterator)findAncestorWithClass(this, ChapterNationalityITIterator.class);
			pageContext.getOut().print(theChapter.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

