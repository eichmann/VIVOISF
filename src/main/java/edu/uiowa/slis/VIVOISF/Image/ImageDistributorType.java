package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageDistributorIterator theImageDistributorIterator = (ImageDistributorIterator)findAncestorWithClass(this, ImageDistributorIterator.class);
			pageContext.getOut().print(theImageDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for distributor tag ");
		}
		return SKIP_BODY;
	}
}

