package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisCitedByIterator theThesisCitedByIterator = (ThesisCitedByIterator)findAncestorWithClass(this, ThesisCitedByIterator.class);
			pageContext.getOut().print(theThesisCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

