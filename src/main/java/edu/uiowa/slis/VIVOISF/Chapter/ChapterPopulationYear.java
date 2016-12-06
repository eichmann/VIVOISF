package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPopulationYearIterator theChapter = (ChapterPopulationYearIterator)findAncestorWithClass(this, ChapterPopulationYearIterator.class);
			pageContext.getOut().print(theChapter.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

