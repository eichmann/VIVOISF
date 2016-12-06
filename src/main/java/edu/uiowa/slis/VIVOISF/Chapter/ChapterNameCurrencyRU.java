package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyRUIterator theChapter = (ChapterNameCurrencyRUIterator)findAncestorWithClass(this, ChapterNameCurrencyRUIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

