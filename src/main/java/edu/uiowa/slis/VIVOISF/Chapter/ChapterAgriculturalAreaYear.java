package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterAgriculturalAreaYearIterator theChapter = (ChapterAgriculturalAreaYearIterator)findAncestorWithClass(this, ChapterAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theChapter.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
