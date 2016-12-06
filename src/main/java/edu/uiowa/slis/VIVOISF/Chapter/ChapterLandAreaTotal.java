package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterLandAreaTotalIterator theChapter = (ChapterLandAreaTotalIterator)findAncestorWithClass(this, ChapterLandAreaTotalIterator.class);
			pageContext.getOut().print(theChapter.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

