package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideDistributorIterator theSlideDistributorIterator = (SlideDistributorIterator)findAncestorWithClass(this, SlideDistributorIterator.class);
			pageContext.getOut().print(theSlideDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for distributor tag ");
		}
		return SKIP_BODY;
	}
}

