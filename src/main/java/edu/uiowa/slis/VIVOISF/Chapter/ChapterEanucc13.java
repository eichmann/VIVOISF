package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterEanucc13Iterator theChapter = (ChapterEanucc13Iterator)findAncestorWithClass(this, ChapterEanucc13Iterator.class);
			pageContext.getOut().print(theChapter.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

