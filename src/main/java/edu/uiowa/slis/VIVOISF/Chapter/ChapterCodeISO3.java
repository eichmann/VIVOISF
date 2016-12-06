package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeISO3Iterator theChapter = (ChapterCodeISO3Iterator)findAncestorWithClass(this, ChapterCodeISO3Iterator.class);
			pageContext.getOut().print(theChapter.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

