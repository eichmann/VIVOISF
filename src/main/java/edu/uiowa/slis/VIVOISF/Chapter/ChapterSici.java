package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterSiciIterator theChapter = (ChapterSiciIterator)findAncestorWithClass(this, ChapterSiciIterator.class);
			pageContext.getOut().print(theChapter.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for sici tag ");
		}
		return SKIP_BODY;
	}
}

