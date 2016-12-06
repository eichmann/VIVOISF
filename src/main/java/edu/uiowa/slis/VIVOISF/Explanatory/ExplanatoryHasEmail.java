package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryHasEmailIterator theExplanatoryHasEmailIterator = (ExplanatoryHasEmailIterator)findAncestorWithClass(this, ExplanatoryHasEmailIterator.class);
			pageContext.getOut().print(theExplanatoryHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

