package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCountryAreaYearIterator theChapter = (ChapterCountryAreaYearIterator)findAncestorWithClass(this, ChapterCountryAreaYearIterator.class);
			pageContext.getOut().print(theChapter.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

