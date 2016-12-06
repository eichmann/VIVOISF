package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortARIterator theChapter = (ChapterNameShortARIterator)findAncestorWithClass(this, ChapterNameShortARIterator.class);
			pageContext.getOut().print(theChapter.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

