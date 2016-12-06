package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortITIterator theeconomic_region = (economic_regionNameShortITIterator)findAncestorWithClass(this, economic_regionNameShortITIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

