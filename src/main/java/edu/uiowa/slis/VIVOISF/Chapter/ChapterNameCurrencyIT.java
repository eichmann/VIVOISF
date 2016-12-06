package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyITIterator theChapter = (ChapterNameCurrencyITIterator)findAncestorWithClass(this, ChapterNameCurrencyITIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

