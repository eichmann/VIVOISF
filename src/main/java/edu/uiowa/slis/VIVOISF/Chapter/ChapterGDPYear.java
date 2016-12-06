package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterGDPYearIterator theChapter = (ChapterGDPYearIterator)findAncestorWithClass(this, ChapterGDPYearIterator.class);
			pageContext.getOut().print(theChapter.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

