package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryHasURLIterator theExplanatoryHasURLIterator = (ExplanatoryHasURLIterator)findAncestorWithClass(this, ExplanatoryHasURLIterator.class);
			pageContext.getOut().print(theExplanatoryHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

