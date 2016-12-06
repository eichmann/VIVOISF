package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameOfficialFRIterator theChapter = (ChapterNameOfficialFRIterator)findAncestorWithClass(this, ChapterNameOfficialFRIterator.class);
			pageContext.getOut().print(theChapter.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

