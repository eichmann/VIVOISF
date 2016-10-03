package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDistributorIterator theConferencePosterDistributorIterator = (ConferencePosterDistributorIterator)findAncestorWithClass(this, ConferencePosterDistributorIterator.class);
			pageContext.getOut().print(theConferencePosterDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for distributor tag ");
		}
		return SKIP_BODY;
	}
}

