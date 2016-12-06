package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryHasAddressIterator theExplanatoryHasAddressIterator = (ExplanatoryHasAddressIterator)findAncestorWithClass(this, ExplanatoryHasAddressIterator.class);
			pageContext.getOut().print(theExplanatoryHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

