package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideInformationResourceSupportedByIterator theSlideInformationResourceSupportedByIterator = (SlideInformationResourceSupportedByIterator)findAncestorWithClass(this, SlideInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSlideInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

