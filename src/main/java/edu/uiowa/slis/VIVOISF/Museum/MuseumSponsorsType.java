package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumSponsorsIterator theMuseumSponsorsIterator = (MuseumSponsorsIterator)findAncestorWithClass(this, MuseumSponsorsIterator.class);
			pageContext.getOut().print(theMuseumSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

