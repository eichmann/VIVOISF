package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortITIterator theChapter = (ChapterNameShortITIterator)findAncestorWithClass(this, ChapterNameShortITIterator.class);
			pageContext.getOut().print(theChapter.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

