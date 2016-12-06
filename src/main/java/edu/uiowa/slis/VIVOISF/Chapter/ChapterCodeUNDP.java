package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeUNDPIterator theChapter = (ChapterCodeUNDPIterator)findAncestorWithClass(this, ChapterCodeUNDPIterator.class);
			pageContext.getOut().print(theChapter.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

