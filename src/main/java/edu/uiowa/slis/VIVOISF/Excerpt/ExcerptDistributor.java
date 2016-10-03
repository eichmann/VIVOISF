package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptDistributorIterator theExcerptDistributorIterator = (ExcerptDistributorIterator)findAncestorWithClass(this, ExcerptDistributorIterator.class);
			pageContext.getOut().print(theExcerptDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for distributor tag ");
		}
		return SKIP_BODY;
	}
}

