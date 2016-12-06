package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterAgriculturalAreaUnitIterator theChapter = (ChapterAgriculturalAreaUnitIterator)findAncestorWithClass(this, ChapterAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theChapter.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

