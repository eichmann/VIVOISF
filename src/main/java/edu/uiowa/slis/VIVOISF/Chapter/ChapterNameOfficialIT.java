package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameOfficialITIterator theChapter = (ChapterNameOfficialITIterator)findAncestorWithClass(this, ChapterNameOfficialITIterator.class);
			pageContext.getOut().print(theChapter.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

