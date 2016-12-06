package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPopulationTotalIterator theChapter = (ChapterPopulationTotalIterator)findAncestorWithClass(this, ChapterPopulationTotalIterator.class);
			pageContext.getOut().print(theChapter.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

