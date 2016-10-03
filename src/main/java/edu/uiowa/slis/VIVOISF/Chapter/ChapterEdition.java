package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterEditionIterator theChapter = (ChapterEditionIterator)findAncestorWithClass(this, ChapterEditionIterator.class);
			pageContext.getOut().print(theChapter.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for edition tag ");
		}
		return SKIP_BODY;
	}
}

