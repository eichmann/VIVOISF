package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterLccnIterator theChapter = (ChapterLccnIterator)findAncestorWithClass(this, ChapterLccnIterator.class);
			pageContext.getOut().print(theChapter.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for lccn tag ");
		}
		return SKIP_BODY;
	}
}

