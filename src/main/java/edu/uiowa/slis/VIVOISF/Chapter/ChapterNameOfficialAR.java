package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameOfficialARIterator theChapter = (ChapterNameOfficialARIterator)findAncestorWithClass(this, ChapterNameOfficialARIterator.class);
			pageContext.getOut().print(theChapter.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

