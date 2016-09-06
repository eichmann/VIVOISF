package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideCitedByIterator theSlideCitedByIterator = (SlideCitedByIterator)findAncestorWithClass(this, SlideCitedByIterator.class);
			pageContext.getOut().print(theSlideCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

