package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterReproducedInIterator theChapterReproducedInIterator = (ChapterReproducedInIterator)findAncestorWithClass(this, ChapterReproducedInIterator.class);
			pageContext.getOut().print(theChapterReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

