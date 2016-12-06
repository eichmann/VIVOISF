package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeISO2Iterator theChapter = (ChapterCodeISO2Iterator)findAncestorWithClass(this, ChapterCodeISO2Iterator.class);
			pageContext.getOut().print(theChapter.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

