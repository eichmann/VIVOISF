package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterRO_0001025Iterator theChapterRO_0001025Iterator = (ChapterRO_0001025Iterator)findAncestorWithClass(this, ChapterRO_0001025Iterator.class);
			pageContext.getOut().print(theChapterRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

