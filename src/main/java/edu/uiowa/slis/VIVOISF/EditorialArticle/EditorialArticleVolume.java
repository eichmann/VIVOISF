package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleVolumeIterator theEditorialArticle = (EditorialArticleVolumeIterator)findAncestorWithClass(this, EditorialArticleVolumeIterator.class);
			pageContext.getOut().print(theEditorialArticle.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for volume tag ");
		}
		return SKIP_BODY;
	}
}

