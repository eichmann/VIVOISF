package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryHasURLIterator theExplanatoryHasURLIterator = (ExplanatoryHasURLIterator)findAncestorWithClass(this, ExplanatoryHasURLIterator.class);
			pageContext.getOut().print(theExplanatoryHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

