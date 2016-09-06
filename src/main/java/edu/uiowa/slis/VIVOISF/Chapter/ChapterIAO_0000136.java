package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterIAO_0000136Iterator theChapterIAO_0000136Iterator = (ChapterIAO_0000136Iterator)findAncestorWithClass(this, ChapterIAO_0000136Iterator.class);
			pageContext.getOut().print(theChapterIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

