package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameListITIterator theeconomic_region = (economic_regionNameListITIterator)findAncestorWithClass(this, economic_regionNameListITIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

