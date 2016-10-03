package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterGtin14Iterator theChapter = (ChapterGtin14Iterator)findAncestorWithClass(this, ChapterGtin14Iterator.class);
			pageContext.getOut().print(theChapter.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

