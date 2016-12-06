package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyESIterator theChapter = (ChapterNameCurrencyESIterator)findAncestorWithClass(this, ChapterNameCurrencyESIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

