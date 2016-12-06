package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterHasAddressIterator theChapterHasAddressIterator = (ChapterHasAddressIterator)findAncestorWithClass(this, ChapterHasAddressIterator.class);
			pageContext.getOut().print(theChapterHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

