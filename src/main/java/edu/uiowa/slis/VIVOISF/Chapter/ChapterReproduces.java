package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterReproducesIterator theChapterReproducesIterator = (ChapterReproducesIterator)findAncestorWithClass(this, ChapterReproducesIterator.class);
			pageContext.getOut().print(theChapterReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

