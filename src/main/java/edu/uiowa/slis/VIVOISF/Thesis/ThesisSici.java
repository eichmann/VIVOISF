package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisSiciIterator theThesis = (ThesisSiciIterator)findAncestorWithClass(this, ThesisSiciIterator.class);
			pageContext.getOut().print(theThesis.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for sici tag ");
		}
		return SKIP_BODY;
	}
}

