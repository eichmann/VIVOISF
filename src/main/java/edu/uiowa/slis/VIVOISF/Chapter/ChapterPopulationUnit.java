package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPopulationUnitIterator theChapter = (ChapterPopulationUnitIterator)findAncestorWithClass(this, ChapterPopulationUnitIterator.class);
			pageContext.getOut().print(theChapter.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

