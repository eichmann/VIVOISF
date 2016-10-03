package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterOclcnumIterator theChapter = (ChapterOclcnumIterator)findAncestorWithClass(this, ChapterOclcnumIterator.class);
			pageContext.getOut().print(theChapter.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

