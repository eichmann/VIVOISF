package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameCurrencyZHIterator theChapter = (ChapterNameCurrencyZHIterator)findAncestorWithClass(this, ChapterNameCurrencyZHIterator.class);
			pageContext.getOut().print(theChapter.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

