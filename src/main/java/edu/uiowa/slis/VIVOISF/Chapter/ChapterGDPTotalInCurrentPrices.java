package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterGDPTotalInCurrentPricesIterator theChapter = (ChapterGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ChapterGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theChapter.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

