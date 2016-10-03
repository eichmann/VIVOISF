package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookDistributorIterator theMultiVolumeBookDistributorIterator = (MultiVolumeBookDistributorIterator)findAncestorWithClass(this, MultiVolumeBookDistributorIterator.class);
			pageContext.getOut().print(theMultiVolumeBookDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for distributor tag ");
		}
		return SKIP_BODY;
	}
}

