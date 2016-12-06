package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterRO_0002234Iterator theChapterRO_0002234Iterator = (ChapterRO_0002234Iterator)findAncestorWithClass(this, ChapterRO_0002234Iterator.class);
			pageContext.getOut().print(theChapterRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

