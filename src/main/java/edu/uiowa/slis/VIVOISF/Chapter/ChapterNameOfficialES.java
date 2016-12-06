package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameOfficialESIterator theChapter = (ChapterNameOfficialESIterator)findAncestorWithClass(this, ChapterNameOfficialESIterator.class);
			pageContext.getOut().print(theChapter.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

