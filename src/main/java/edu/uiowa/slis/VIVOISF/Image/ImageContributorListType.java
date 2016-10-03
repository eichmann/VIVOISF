package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageContributorListIterator theImageContributorListIterator = (ImageContributorListIterator)findAncestorWithClass(this, ImageContributorListIterator.class);
			pageContext.getOut().print(theImageContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

