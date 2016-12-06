package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCountryAreaUnitIterator theChapter = (ChapterCountryAreaUnitIterator)findAncestorWithClass(this, ChapterCountryAreaUnitIterator.class);
			pageContext.getOut().print(theChapter.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

