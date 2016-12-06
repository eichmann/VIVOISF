package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterLandAreaUnitIterator theChapter = (ChapterLandAreaUnitIterator)findAncestorWithClass(this, ChapterLandAreaUnitIterator.class);
			pageContext.getOut().print(theChapter.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

