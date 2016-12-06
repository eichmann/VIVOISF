package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionSourceModifiedIterator theeconomic_region = (economic_regionSourceModifiedIterator)findAncestorWithClass(this, economic_regionSourceModifiedIterator.class);
			pageContext.getOut().print(theeconomic_region.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

