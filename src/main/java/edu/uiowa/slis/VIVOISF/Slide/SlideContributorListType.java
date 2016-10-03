package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideContributorListIterator theSlideContributorListIterator = (SlideContributorListIterator)findAncestorWithClass(this, SlideContributorListIterator.class);
			pageContext.getOut().print(theSlideContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

