package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteDistributorIterator theStatuteDistributorIterator = (StatuteDistributorIterator)findAncestorWithClass(this, StatuteDistributorIterator.class);
			pageContext.getOut().print(theStatuteDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for distributor tag ");
		}
		return SKIP_BODY;
	}
}

