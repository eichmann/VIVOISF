package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyFRIterator theChapter = (ChapterNameCurrencyFRIterator)findAncestorWithClass(this, ChapterNameCurrencyFRIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

