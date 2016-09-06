package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterRO_0000056Iterator theChapterRO_0000056Iterator = (ChapterRO_0000056Iterator)findAncestorWithClass(this, ChapterRO_0000056Iterator.class);
			pageContext.getOut().print(theChapterRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

