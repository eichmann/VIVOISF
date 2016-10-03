package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideContributorListIterator theSlideContributorListIterator = (SlideContributorListIterator)findAncestorWithClass(this, SlideContributorListIterator.class);
			pageContext.getOut().print(theSlideContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

