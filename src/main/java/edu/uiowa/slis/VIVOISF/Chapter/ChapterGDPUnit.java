package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterGDPUnitIterator theChapter = (ChapterGDPUnitIterator)findAncestorWithClass(this, ChapterGDPUnitIterator.class);
			pageContext.getOut().print(theChapter.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

