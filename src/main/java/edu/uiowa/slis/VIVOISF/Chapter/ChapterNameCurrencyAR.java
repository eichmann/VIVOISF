package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyARIterator theChapter = (ChapterNameCurrencyARIterator)findAncestorWithClass(this, ChapterNameCurrencyARIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

