package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterTheAbstractIterator theChapter = (ChapterTheAbstractIterator)findAncestorWithClass(this, ChapterTheAbstractIterator.class);
			pageContext.getOut().print(theChapter.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

