package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayDistributorIterator theScreenplayDistributorIterator = (ScreenplayDistributorIterator)findAncestorWithClass(this, ScreenplayDistributorIterator.class);
			pageContext.getOut().print(theScreenplayDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for distributor tag ");
		}
		return SKIP_BODY;
	}
}

