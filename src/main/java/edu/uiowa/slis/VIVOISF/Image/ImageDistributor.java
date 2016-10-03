package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageDistributorIterator theImageDistributorIterator = (ImageDistributorIterator)findAncestorWithClass(this, ImageDistributorIterator.class);
			pageContext.getOut().print(theImageDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for distributor tag ");
		}
		return SKIP_BODY;
	}
}

