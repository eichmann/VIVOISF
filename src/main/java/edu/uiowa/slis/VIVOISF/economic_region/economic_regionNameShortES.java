package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortESIterator theeconomic_region = (economic_regionNameShortESIterator)findAncestorWithClass(this, economic_regionNameShortESIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

