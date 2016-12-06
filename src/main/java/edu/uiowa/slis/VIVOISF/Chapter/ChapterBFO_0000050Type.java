package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterBFO_0000050Iterator theChapterBFO_0000050Iterator = (ChapterBFO_0000050Iterator)findAncestorWithClass(this, ChapterBFO_0000050Iterator.class);
			pageContext.getOut().print(theChapterBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

