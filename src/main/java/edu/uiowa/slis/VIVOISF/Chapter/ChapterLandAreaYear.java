package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterLandAreaYearIterator theChapter = (ChapterLandAreaYearIterator)findAncestorWithClass(this, ChapterLandAreaYearIterator.class);
			pageContext.getOut().print(theChapter.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

