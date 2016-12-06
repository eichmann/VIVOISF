package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCountryAreaTotalIterator theChapter = (ChapterCountryAreaTotalIterator)findAncestorWithClass(this, ChapterCountryAreaTotalIterator.class);
			pageContext.getOut().print(theChapter.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

