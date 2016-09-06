package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterCitesIterator theChapterCitesIterator = (ChapterCitesIterator)findAncestorWithClass(this, ChapterCitesIterator.class);
			pageContext.getOut().print(theChapterCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for cites tag ");
		}
		return SKIP_BODY;
	}
}

