package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideCitesIterator theSlideCitesIterator = (SlideCitesIterator)findAncestorWithClass(this, SlideCitesIterator.class);
			pageContext.getOut().print(theSlideCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for cites tag ");
		}
		return SKIP_BODY;
	}
}

