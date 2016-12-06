package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterAgriculturalAreaTotalIterator theChapter = (ChapterAgriculturalAreaTotalIterator)findAncestorWithClass(this, ChapterAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theChapter.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

