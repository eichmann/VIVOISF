package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyENIterator theChapter = (ChapterNameCurrencyENIterator)findAncestorWithClass(this, ChapterNameCurrencyENIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

