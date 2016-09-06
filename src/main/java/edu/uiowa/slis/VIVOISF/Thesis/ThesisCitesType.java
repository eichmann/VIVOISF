package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisCitesIterator theThesisCitesIterator = (ThesisCitesIterator)findAncestorWithClass(this, ThesisCitesIterator.class);
			pageContext.getOut().print(theThesisCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for cites tag ");
		}
		return SKIP_BODY;
	}
}

