package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterERO_0000045Iterator theChapter = (ChapterERO_0000045Iterator)findAncestorWithClass(this, ChapterERO_0000045Iterator.class);
			pageContext.getOut().print(theChapter.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

