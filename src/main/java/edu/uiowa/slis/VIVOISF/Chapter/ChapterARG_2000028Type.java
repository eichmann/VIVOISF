package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterARG_2000028Iterator theChapterARG_2000028Iterator = (ChapterARG_2000028Iterator)findAncestorWithClass(this, ChapterARG_2000028Iterator.class);
			pageContext.getOut().print(theChapterARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

