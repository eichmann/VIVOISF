package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDistributorIterator theConferencePosterDistributorIterator = (ConferencePosterDistributorIterator)findAncestorWithClass(this, ConferencePosterDistributorIterator.class);
			pageContext.getOut().print(theConferencePosterDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for distributor tag ");
		}
		return SKIP_BODY;
	}
}

