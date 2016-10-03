package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterDistributorIterator theChapterDistributorIterator = (ChapterDistributorIterator)findAncestorWithClass(this, ChapterDistributorIterator.class);
			pageContext.getOut().print(theChapterDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for distributor tag ");
		}
		return SKIP_BODY;
	}
}

