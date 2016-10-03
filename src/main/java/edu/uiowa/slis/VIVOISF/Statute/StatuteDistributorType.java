package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteDistributorIterator theStatuteDistributorIterator = (StatuteDistributorIterator)findAncestorWithClass(this, StatuteDistributorIterator.class);
			pageContext.getOut().print(theStatuteDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for distributor tag ");
		}
		return SKIP_BODY;
	}
}

