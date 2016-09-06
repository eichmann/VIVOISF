package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterInformationResourceSupportedByIterator theChapterInformationResourceSupportedByIterator = (ChapterInformationResourceSupportedByIterator)findAncestorWithClass(this, ChapterInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theChapterInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

